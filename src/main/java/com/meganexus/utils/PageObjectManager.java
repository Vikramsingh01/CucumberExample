package com.meganexus.utils;

import org.openqa.selenium.WebDriver;

import com.megannexus.pages.HomePage;
import com.megannexus.pages.LoginPage;

public class PageObjectManager {

	private WebDriver driver;
	//private HomePage homePage;
	private LoginPage loginPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}

	/*public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}*/

}