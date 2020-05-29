package com.clark.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class RegisterPage extends BaseLib {
	@FindBy(xpath = "//input[@type='email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement RegisterBtn;
	
	public PersnolInformationPage register() {
	 sendKeys(Email, prop.getProperty("email"));
	 sendKeys(Password, prop.getProperty("password"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", RegisterBtn);
	 clickElement(RegisterBtn);
	 return new PersnolInformationPage();
	}

}
