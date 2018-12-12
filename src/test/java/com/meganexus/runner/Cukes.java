package com.meganexus.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.meganexus.utils.WebDriverManager;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.java.en_au.ButattheendofthedayIreckon;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				 "pretty", "html:target/cucumberHtmlReport",
			     "html:target/cucumberHtmlReport",//for html result
				 "pretty:target/cucumber-json-report.json",//for json result
			     "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
			     },
				
		        tags = { "@tag" },
		        features = { "src/test/resources/features/" },
				glue = {"com.meganexus.StepDefs" },
				dryRun = true,//checks that every Step mentioned in the Feature File have corresponding code written in Step Definition file or not
				strict = false,//at execution time if cucumber encounters any undefined/pending steps then cucumber does not fail the execution
			    monochrome = true//console output for the Cucumber test are much more readable
				
	)

public class Cukes {
	
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("configs/report.xml"));
    
    }
}
