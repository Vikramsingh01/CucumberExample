
package com.meganexus.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ErrorHandler;

import com.meganexus.enums.DriverType;
import com.meganexus.enums.EnvironmentType;

public class WebDriverManager {
	public static WebDriver driver;
	private static DriverType driverType ;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	static {
		 driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		 environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
		 driver = createDriver();
	}
	
	public static WebDriver getDriver() {
		/*if (driver == null) {
			driver = createDriver();
		}*/
		return driver;
	}

	private static WebDriver createDriver() {
		switch (environmentType) {
		case LOCAL:
			DesiredCapabilities capabilities = null;
			capabilities = DesiredCapabilities.chrome();
			capabilities.setJavascriptEnabled(true);
			capabilities.setCapability("takesScreenshot", true);
			driver = createLocalDriver(capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(
					FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
			break;
		case REMOTE:
			driver = createRemoteDriver();
			break;
		}
		return driver;
	}

	private static WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	private static WebDriver createLocalDriver(DesiredCapabilities capabilities) {
		boolean headless = System.getProperty("Headless", "true").equals("true");
		switch (driverType) {
		case FIREFOX:
			FirefoxOptions options = new FirefoxOptions();
			// capabilities.s
			if (headless) {
				options.addArguments("-headless", "-safe-mode");
			}
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
			final FirefoxDriver firefox = new FirefoxDriver();
			return firefox;

		case INTERNETEXPLORER:
			InternetExplorerDriver ie = new InternetExplorerDriver();
			return ie;

		default:
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigReader().getDriverPath());
			final ChromeOptions chromeOptions = new ChromeOptions();
			if (headless) {
				chromeOptions.addArguments("--headless");
			}
			chromeOptions.addArguments("--incognito");
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			System.out.println("********************* before driver created");
			driver = new ChromeDriver();
			System.out.println("********************* after driver created");
			ErrorHandler handler = new ErrorHandler();
			handler.setIncludeServerErrors(false);
			// ((RemoteWebDriver) driver).setErrorHandler(handler);
			return driver;

		}
	}

	public void teardowndriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}