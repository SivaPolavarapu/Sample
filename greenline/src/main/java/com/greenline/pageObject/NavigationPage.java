package com.greenline.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://gfr-dev-www.fmr.com")
public class NavigationPage extends PageObject {
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[4]/td[10]/a")
	private WebElement dashBoard;
	
	@FindBy(xpath = "/html/body/section/table/tbody/tr[2]/td[2]/section/table/tbody/tr[1]/td/a")
	private WebElement cluster;
	
	@FindBy(xpath = "/html/body/gfr-root/gfr-navbar/nav/div/ul/li[2]/a")
	private WebElement fixMessage;
	
	@FindBy(xpath = "/html/body/gfr-root/gfr-navbar/nav/div/ul/li[2]/div/a[1]")
	private WebElement orderExecution;
	
	@FindBy(xpath = "/html/body/gfr-root/main/div/gfr-orders-executions/div/div[1]/div/div/gfr-orders-grid/ag-grid-angular/div/div[2]/div[2]/div/div[1]/div/div[1]/div[3]/div/div[2]/div[4]/div[1]/div/input")
	private WebElement searchInputField;

	public NavigationPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnFBCP() {
		element(cluster).click();
		//getDriver().findElement(By.linkText("FBCP Application Clusters")).click();
	}

	public void clickOnSit() {
		element(dashBoard).click();
		}

	public void hoverOnFix() {
		Actions builder = new Actions(getDriver());
		builder.moveToElement(fixMessage).build().perform();
		}

	public void clickOrderExecution() {
		element(orderExecution).click();
	}

	public void searchFor(String searchRequest) {
		element(searchInputField).clear();
		element(searchInputField).typeAndEnter(searchRequest);
		}
}
