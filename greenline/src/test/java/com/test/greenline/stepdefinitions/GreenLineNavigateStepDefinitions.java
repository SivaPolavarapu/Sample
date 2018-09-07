package com.test.greenline.stepdefinitions;


import com.test.greenline.steps.GreenLineNavigateSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GreenLineNavigateStepDefinitions {
	
	
	@Steps
	GreenLineNavigateSteps greenLineNavigateSteps;
	
	@Given("^I want to navigate to GF UI$")
	public void i_want_to_navigate_to_GFR_UI()  {
	   		
		greenLineNavigateSteps.openGreenLinepage();
	}

	@When("^I click on FBCP Application cluster$")
	public void i_click_on_FBCP_Application_cluster()  {
	   
		greenLineNavigateSteps.clickOn();
	}

	@Then("^I click on DashBoard$")
	public void i_click_on_DashBoard()  {
		greenLineNavigateSteps.thenClickOn();
	    
	}

	@Then("^I mouse over on FixMessage$")
	public void i_mouse_over_on_FixMessage()  {
		greenLineNavigateSteps.hoverOnFixMessage();
	    
	}

	@Then("^I click on Orders&Execution$")
	public void i_click_on_Orders_Execution()  {
		greenLineNavigateSteps.clickOnOrderExecution();
	    
	}

	@Then("^I search for ClOrdID$")
	public void i_search_for_ClOrdID(String searchRequest)  {
		greenLineNavigateSteps.searchFor(searchRequest);
	    
	}



}
