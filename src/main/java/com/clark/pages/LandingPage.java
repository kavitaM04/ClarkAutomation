package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class LandingPage extends BaseLib {

	@FindBy(xpath = "//header/nav/ul[1]/li[4]/a")
	WebElement Angebote;

	public SelectInsurancePage selectAngebote() {
		clickElement(Angebote);
		return new SelectInsurancePage();
	}

}
