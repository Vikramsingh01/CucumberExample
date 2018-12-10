/*package com.meganexus.runner;

import org.openqa.selenium.WebDriver;

import com.meganexus.utils.PageObjectManager;
import com.meganexus.utils.TestContext;
import com.meganexus.utils.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks{

	TestContext testcontext;
	WebDriver driver;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;

    @Before
    public void testInitializer(){
    	webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		System.out.println("in before method");
		
    }


    @After
    public void tearDownTest(){
        webDriverManager.getDriver().close();
    }
}*/