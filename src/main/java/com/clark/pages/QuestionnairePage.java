package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class QuestionnairePage  extends BaseLib{
	
	@FindBy(xpath = "//div[@class='questionnaire__question']/ul/li[1]/div/span")
	WebElement question;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement textInput;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn--arrow btn--mobile-block btn-next-split']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//div[@class='_reward-screen_ie5k4r']/div/div/div[1]")
	WebElement GoToOfferBtn;


	public void answerQuestion() {
		for (int i = 1; i <= 3; i++) {
		clickElement(question);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	sendKeys(textInput, "Test Insurance");	
	}
	
	public void submitAnswers() {
		clickElement(continueBtn);
	}
	
	public OffersPage gotoOffers() {
		clickElement(GoToOfferBtn);
		return new OffersPage();
	}
	
}
