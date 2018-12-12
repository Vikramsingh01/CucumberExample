package com.meganexus.runner;

import com.meganexus.utils.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void testInitializer() {
		System.out.println("Hi I am in before block ..");
		WebDriverManager.getDriver();
		

	}

	@After
	public void tearDownTest() {
		System.out.println("Bye I am in after block .. ");
	}
}