package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class OffersPage extends BaseLib {

	@FindBy(xpath = "//div[@class='offers__offer ']/section/div[1]/section/div/div/div[2]/div[2]/button")
	WebElement selectOffer;
	
	public RegisterPage selectOffer() {
		clickElement(selectOffer);
		return new RegisterPage();
	}
	
}
