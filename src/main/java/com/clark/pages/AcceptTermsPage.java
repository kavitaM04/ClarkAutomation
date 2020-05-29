package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class AcceptTermsPage extends BaseLib {

	@FindBy(xpath = "//span[@id='consent-broker']")
	WebElement confirmation;

	@FindBy(xpath = "//button[@type='button']")
	WebElement RequestAnOffer_Btn;

	public void selectTerms() {
		clickElement(confirmation);
	}

	public QuestionnairePage requestOffer() {
		scrollTillElement(RequestAnOffer_Btn);
		clickElement(RequestAnOffer_Btn);
		return new QuestionnairePage();
	}
}
