package com.google.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.google.steps",
		tags = "@simpleSearchExample2,@simpleSearchExample1"
		
		)




public class runners extends AbstractTestNGCucumberTests {

}
