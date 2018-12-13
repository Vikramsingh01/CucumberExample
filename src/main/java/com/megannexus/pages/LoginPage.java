package com.megannexus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.j2objc.annotations.AutoreleasePool;
import com.meganexus.methods.ClickElementsMethods;
import com.meganexus.methods.InputMethods;
import com.meganexus.runner.Hook;
import com.meganexus.utils.ConfigFileReader;
import com.meganexus.utils.FileReaderManager;
import com.meganexus.utils.WebDriverManager;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement usertxtBox;
	@FindBy(id = "pwd")
	private WebElement passwdtxtBox;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBtn;

	// WebDriver driver=WebDriverManager.driver;
	WebDriver driver;
	ConfigFileReader configFileReader;
	InputMethods im = new InputMethods();
	ClickElementsMethods cem = new ClickElementsMethods();

	public LoginPage() {
		super();
		this.driver = Hook.getDriver();
	}

	public void Launch_URL() {

		driver.get(FileReaderManager.getInstance().getConfigReader().getPropertyValue("url"));
	}

	public void login() throws InterruptedException {
		im.enterText("id",FileReaderManager.getInstance().getConfigReader().getPropertyValue("username"), "username");
		im.enterText("id",FileReaderManager.getInstance().getConfigReader().getPropertyValue("password"), "pwd");
		cem.click("xpath", "//button[@type='submit']");
		Thread.sleep(9000);
	}

}
