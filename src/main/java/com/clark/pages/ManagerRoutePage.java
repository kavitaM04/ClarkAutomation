package com.clark.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clark.util.BaseLib;

import junit.framework.Assert;

public class ManagerRoutePage extends BaseLib {

	@FindBy(xpath = "//div[@class='_title_niboal']")
	WebElement Contract_Card;

	public void verifyContract() {
		String title = getTxt(Contract_Card);
		String current_URL = CurrentURL();
		Assert.assertEquals(prop.getProperty("endURL"), current_URL);
		Assert.assertEquals(prop.getProperty("searchKeyword"), title);

	}
}
