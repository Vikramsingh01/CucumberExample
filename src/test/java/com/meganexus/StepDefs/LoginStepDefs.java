package com.meganexus.StepDefs;

import org.openqa.selenium.WebDriver;

import com.meganexus.utils.PageObjectManager;
import com.meganexus.utils.WebDriverManager;
import com.megannexus.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.model.DataTable;

public class LoginStepDefs {
	WebDriver driver;
	LoginPage loginPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;

	@Given("^Open Browser and launch URL$")
	public void open_Browser_and_launch_URL() throws Throwable {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.navigateTo_LoginPage();
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		loginPage.login();
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		Thread.sleep(4000);
		System.out.println("user logged in ..");
	}

	@When("^User Navigate to crc service users$")
	public void user_Navigate_to_crc_service_users() throws Throwable {
	}

	@When("^click on filter$")
	public void click_on_filter() throws Throwable {
	}

	@Then("^enter first name and last name$")
	public void enter_first_name_and_last_name(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
	}

}
