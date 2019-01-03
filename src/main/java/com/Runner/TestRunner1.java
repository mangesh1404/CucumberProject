package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
	
	features="C:\\Users\\mangesh\\eclipse-workspace\\CucumberWithMap\\src\\main\\java\\com\\Feature\\TagsEx.feature"
    ,glue= "com.Stepdefinition",
    format= {"pretty","html:test-output"},
	monochrome= true,
	dryRun= false,
    tags= {"@regression"}
)

public class TestRunner1 {

	
}
