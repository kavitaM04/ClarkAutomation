package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class SelectInsurancePage extends BaseLib {

	@FindBy(xpath = "//div[@class='_list-item_1mfwfb']/span")
	WebElement Privathaftpflicht;
	
	@FindBy(xpath = "//input[@class='ember-text-field ember-view']")
	WebElement searchInput;
	
	public void searchInput() {
		searchInput.sendKeys(prop.getProperty("searchKeyword"));
	}
	
	public AcceptTermsPage selectPrivathaftpflicht() {
		scrollTillElement(Privathaftpflicht);
		clickElement(Privathaftpflicht);
		return new AcceptTermsPage();
	}
	

}
