package com.meganexus.StepDefs;

import org.openqa.selenium.WebDriver;

import com.meganexus.pojo.Customer;
import com.meganexus.utils.FileReaderManager;
import com.meganexus.utils.PageObjectManager;
import com.meganexus.utils.WebDriverManager;
import com.megannexus.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDefs {
	/*TestContext testContext;
	HomePage homePage;
	//Customer customer;
	public HomeStepDefs(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}*/
	WebDriver driver;
	HomePage homePage;
	PageObjectManager pageObjectManager;	
	WebDriverManager webDriverManager;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();	
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName("vikram");
			homePage.fill_PersonalDetails(customer);
	}

	@When("^User Navigate to Home Page$")
	public void user_Navigate_to_Home_Page() throws Throwable {
	}

	@When("^select products$")
	public void select_products() throws Throwable {
	}

	@Then("^product add to cart Successfully$")
	public void product_add_to_cart_Successfully() throws Throwable {
	}

}
