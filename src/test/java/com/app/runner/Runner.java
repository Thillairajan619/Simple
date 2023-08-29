package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Yuvaraj\\eclipse-workspace\\Oct_Cucumber"
		+ "\\src\\test\\java\\com\\app\\feature",glue="stepDefinition",
		dryRun=false,monochrome=true,
		plugin= {"rerun:target/rerun.txt",
				"pretty","html:target/cucumber-reports",
				"json:target/cucumber.json"})
public class Runner {

}
