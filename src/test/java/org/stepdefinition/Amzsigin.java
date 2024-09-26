package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Amzsigin extends BaseClass{
	@Given("To launch the browser and maximize window")
	public void toLaunchTheBrowserAndMaximizeWindow() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the Amazon application")
	public void toLaunchTheUrlOfTheAmazonApplication() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To click sigin button")
	public void toClickSiginButton() {
	    WebElement sig = driver.findElement(By.id("nav-link-accountList"));
	    sig.click();
	}
	
	@When("To pass the valid and invalid mobile number or email in mobile number field")
	public void toPassTheValidAndInvalidMobileNumberOrEmailInMobileNumberField(DataTable d) {
//		with header ------> ONE DIMENSIONAL MAP
//		WebElement ph = driver.findElement(By.id("ap_email"));
//	    List<String> l = d.asList();
//	    passText(l.get(1), ph);
		
//		without header ------> ONE DIMENSIONAL LIST
		WebElement ph = driver.findElement(By.id("ap_email"));
		List<String> l = d.asList();
		passText(l.get(2), ph); 
	}

	@When("To click the continue button")
	public void toClickTheContinueButton() {
	   WebElement con = driver.findElement(By.id("continue"));
	   con.click();
	}

	@Then("To close the all browser")
	public void toCloseTheAllBrowser() {
	   closeBrowers();
	}
}
