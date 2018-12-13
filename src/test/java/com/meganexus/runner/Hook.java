package com.meganexus.runner;

import org.openqa.selenium.WebDriver;

import com.meganexus.utils.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before
	public void testInitializer() {
		System.out.println("Hi I am in before block ..");
		driver = WebDriverManager.getDriver();

	}

	public static WebDriver getDriver() {
		if (driver == null) {

		}
		return driver;
	}

	@After
	public void tearDownTest() {
		System.out.println("Bye I am in after block .. ");
		if (driver != null) {
			driver.quit();
		}
	}
}