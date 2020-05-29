package com.clark.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/java/com/clark/features",
		glue = "com/clark/stepDefinitions",	
		format = {"pretty","html:test-output",
				"json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		dryRun=false)
public class TestRunner {

}
