package sampletest;



import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber; 
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features={"src/test/resources/assignment4.feature"},
		glue={"stepdefinition4"},
				plugin = {  
			     "pretty", "html:target/cukes", "json:target/cucumber.json", "junit:target/cukes/junit.xml"},
				tags={"@automationpractice"}
		 
		
		) 

public class runtest { }