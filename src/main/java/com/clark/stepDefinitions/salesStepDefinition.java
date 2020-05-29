package com.clark.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.clark.pages.AcceptTermsPage;
import com.clark.pages.LandingPage;
import com.clark.pages.ManagerRoutePage;
import com.clark.pages.OffersPage;
import com.clark.pages.PersnolInformationPage;
import com.clark.pages.QuestionnairePage;
import com.clark.pages.RegisterPage;
import com.clark.pages.SelectInsurancePage;
import com.clark.util.BaseLib;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class salesStepDefinition extends BaseLib {
	LandingPage landingPage;
	SelectInsurancePage selectInsurancePage;
	AcceptTermsPage acceptTermsPage;
	QuestionnairePage questionnairePage;
	OffersPage offersPage;
	RegisterPage registerPage;
	PersnolInformationPage persnolInformationPage;
	ManagerRoutePage managerRoutePage;

	WebDriver driver;

	@Given("^User opens Browser$")
	public void user_opens_browser() throws Throwable {
		BaseLib.preCondition();
	}

	@When("^User is already on landing page$")
	public void user_is_already_on_landing_page() throws Throwable {
		landingPage = new LandingPage();
	}

	@Then("^Go to Angebote tab to enter sales funnel$")
	public void go_to_Angebote_tab_to_enter_sales_funnel() throws Throwable {
		selectInsurancePage = landingPage.selectAngebote();
		Thread.sleep(5000);
	}

	@Then("^Go to Privathaftpflicht option$")
	public void go_to_Privathaftpflicht_option() throws Throwable {
		selectInsurancePage.searchInput();
		acceptTermsPage = selectInsurancePage.selectPrivathaftpflicht();
		Thread.sleep(2000);
	}

	@Then("^Accept Private liability offer$")
	public void accept_Private_liability_offer() throws Throwable {
		acceptTermsPage.selectTerms();
		Thread.sleep(2000);
		questionnairePage = acceptTermsPage.requestOffer();
	}

	@Then("^complete the questionnaire$")
	public void complete_the_questionnaire() throws Throwable {
		questionnairePage.answerQuestion();
		questionnairePage.submitAnswers();
	}

	@Then("^Go to Offer$")
	public void Go_To_Offer() throws Throwable {
		offersPage = questionnairePage.gotoOffers();
	}

	@Then("^Select Offer$")
	public void Select_Offer() throws Throwable {
		registerPage = offersPage.selectOffer();
	}

	@Then("^Enter Registration details to submit$")
	public void Enter_Registration_details_to_submit() throws Throwable {
		persnolInformationPage = registerPage.register();
	}

	@Then("^Enter Personal Information: \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\"$")
	public void Enter_Personal_Information(String firstname, String lastname, String birthdate, String street,
		String housenumber, String zipcode, String city, String phonenumber, String IBAN) throws Throwable {
		managerRoutePage = persnolInformationPage.enterPersnolInfo(firstname, lastname, birthdate, street, housenumber,
				zipcode, city, phonenumber, IBAN);
	}

	@Then("^Verify that the correct contract is shown on manager route$")
	public void Verify_that_the_correct_contract_is_shown_on_manager_route() throws Throwable {
		managerRoutePage.verifyContract();
	}
}
