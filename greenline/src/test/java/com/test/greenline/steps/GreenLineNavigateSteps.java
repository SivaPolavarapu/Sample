package com.test.greenline.steps;

import com.greenline.pageObject.NavigationPage;

import net.thucydides.core.annotations.Step;

public class GreenLineNavigateSteps {
	
	NavigationPage navigate;

	@Step
	public void openGreenLinepage() {
		navigate.open();
		}

	@Step
	public void clickOn() {
		navigate.clickOnFBCP();
		}

	@Step
	public void thenClickOn() {
		navigate.clickOnSit();
		}

	public void hoverOnFixMessage() {
		navigate.hoverOnFix();
		
	}

	public void clickOnOrderExecution() {
		navigate.clickOrderExecution();
		
	}

	public void searchFor(String searchRequest	) {
		navigate.searchFor(searchRequest);
		
	}

	
}
