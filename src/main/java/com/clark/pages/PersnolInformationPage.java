package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

public class PersnolInformationPage extends BaseLib {
	@FindBy(xpath = "//div[@class='ember-view _container_1rhapd']/ul/li[1]")
	WebElement Salution;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement LastName;

	@FindBy(xpath = "//input[@name='birthdate']")
	WebElement BirthDate;

	@FindBy(xpath = "//input[@name='street']")
	WebElement Street;

	@FindBy(xpath = "//input[@name='houseNumber']")
	WebElement HouseNumber;

	@FindBy(xpath = "//input[@name='zipcode']")
	WebElement ZipCode;

	@FindBy(xpath = "//input[@name='city']")
	WebElement City;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement PhoneNumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitPersnolDetails;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement IBAN;
	
	@FindBy(xpath = "//label[@for='ibanCheck']")
	WebElement ibanCheck;
	
	
	@FindBy(xpath = "//button[2]")
	WebElement Tarif_bestellen_Btn;
	
	
	@FindBy(xpath = "//label[@for='termsCheck']")
	WebElement termsCheck;
	
	
	@FindBy(xpath = "//button[2]")
	WebElement Jetzt_verbindlich_kaufen_Btn;
	
	
	@FindBy(xpath = "//button")
	WebElement Zurück_zur_Übersicht_Btn;
	
	@FindBy(xpath = "//button[@class='cucumber-close-modal  _button_l85hl6 ember-view']")
	WebElement close_Btn;
	

	public ManagerRoutePage enterPersnolInfo(String firstname,String lastname,String birthdate,String street,String housenumber,String zipcode,String city,String phonenumber,String iban) {
		
		clickElement(Salution);
		sendKeys(FirstName,firstname);
		sendKeys(LastName,lastname);
		sendKeys(BirthDate,birthdate);
		
		scrollTillElement(Street);
		sendKeys(Street,street);
		sendKeys(HouseNumber,housenumber);
		
		scrollTillElement(ZipCode);
		sendKeys(ZipCode,zipcode);
		sendKeys(City,city);
		
		scrollTillElement(PhoneNumber);
		sendKeys(PhoneNumber,phonenumber);
		
		scrollTillElement(SubmitPersnolDetails);
		clickElement(SubmitPersnolDetails);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scrollTillElement(IBAN);
		sendKeys(IBAN, iban);
		
		scrollTillElement(ibanCheck);
         clickElement(ibanCheck);
         
         scrollTillElement(Tarif_bestellen_Btn);
        clickElement(Tarif_bestellen_Btn);
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
        scrollTillElement(termsCheck);
        clickElement(termsCheck);
        
         scrollTillElement(Jetzt_verbindlich_kaufen_Btn);
        clickElement(Jetzt_verbindlich_kaufen_Btn);
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        clickElement(Zurück_zur_Übersicht_Btn);
        clickElement(close_Btn);
        return new ManagerRoutePage();
	}

}
