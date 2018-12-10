package com.meganexus.runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@tag1")
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After("@tag1")
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}