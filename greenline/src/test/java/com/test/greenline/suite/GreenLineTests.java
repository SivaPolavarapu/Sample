package com.test.greenline.suite;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features"}, 
glue = {"com.test.greenline.stepdefinitions"})
public class GreenLineTests {
	
	
}
