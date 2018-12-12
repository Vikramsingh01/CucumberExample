package com.megannexus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.meganexus.utils.ConfigFileReader;


public class LoginPage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	@FindBy(id = "username")
	private WebElement usertxtBox;
	@FindBy(id = "pwd")
	private WebElement passwdtxtBox;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBtn;

	public void navigateTo_LoginPage() {

	}

	public void login() {

	}

}
