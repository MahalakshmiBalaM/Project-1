package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntra extends BaseClass{
	@Given("To launch  browser and maximize window")
	public void to_launch_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch  url of the Myntra application")
	public void to_launch_url_of_the_Myntra_application() {
	    launchUrl("https://www.myntra.com/");
	}

	@Then("close the all browser")
	public void close_the_all_browser() {
	    closeBrowers();
	}

}
