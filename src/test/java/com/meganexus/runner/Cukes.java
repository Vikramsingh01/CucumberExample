package com.meganexus.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/main/resources/features/" }, tags = { "@tag1" }, glue = {
		"com.meganexus.StepDefs" }, format = { "html:target/cucumber-report", "json:target/json/output.json" },monochrome=true)
public class Cukes {
	

}
