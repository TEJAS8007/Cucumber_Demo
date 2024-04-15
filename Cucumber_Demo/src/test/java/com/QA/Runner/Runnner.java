package com.QA.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		   features = "src/test/resources/Features/Login.feature",
		   glue = "com.QA.Stepdef",
		   monochrome = true,
		   dryRun = false,
		   plugin= {"pretty","html:Reports//index.html"}
		
		)


public class Runnner {

}
