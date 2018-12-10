package com.megannexus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.meganexus.utils.ConfigFileReader;
import com.meganexus.utils.GenericFunctions;

import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage {
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	@FindBy(xpath = "//a[text()='Login & Signup']")
	private WebElementFacade login_Lnk;
	@FindBy(xpath = "//input[@class='_2zrpKA']")
	private WebElementFacade usertxtBox;
	@FindBy(className = "_2zrpKA _3v41xv")
	private WebElementFacade passwdtxtBox;
	@FindBy(xpath = "//button[@class='vh79eN']")
	private WebElementFacade LoginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	public void navigateTo_LoginPage() {
		driver.get(configFileReader.getApplicationUrl());
	}
	public void login(){
		GenericFunctions.click(login_Lnk);
		GenericFunctions.enterTxt(usertxtBox, configFileReader.getPropertyValue("username"));
		GenericFunctions.enterTxt(passwdtxtBox, configFileReader.getPropertyValue("password"));
		GenericFunctions.click(LoginBtn);
	}

}

