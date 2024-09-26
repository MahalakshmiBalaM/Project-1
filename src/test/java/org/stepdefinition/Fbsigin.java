package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.SignInpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbsigin extends BaseClass {
	
	SignInpojo s;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch url of facebook application")
	public void to_launch_url_of_facebook_application() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To click the create new account")
	public void to_click_the_create_new_account() {
	    s = new SignInpojo();
	    clickbtn(s.getCreateNewAcc());
	}

	@When("To pass the firstname in first text box")
	public void to_pass_the_firstname_in_first_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
//		without header ------> ONE DIMENSIONAL LIST
//		List<String> l = d.asList();
//		passText(l.get(1), s.getFirstname());    
		
//		with header ------> ONE DIMENSIONAL MAP
		Map<String, String> m = d.asMap(String.class, String.class);
		s = new SignInpojo();
		passText(m.get("firstname2"), s.getFirstname());
		
	}

	@When("To pass the secondname in secondname text box")
	public void to_pass_the_secondname_in_secondname_text_box() throws InterruptedException {
		
		s = new SignInpojo();
		passText("lakshmi", s.getSurname());
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
//		without header -------> TWO DIMENSIONAL LIST
//		List<List<String>> lists = d.asLists();
//		passText(lists.get(1).get(3), s.getMail());
		
//		with header----------> TWO DIMENSIONAL MAP
		
		List<Map<String, String>> m = d.asMaps();
		s = new SignInpojo();
		passText(m.get(2).get("mail"), s.getMail());
		
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new SignInpojo();
		passText("sdfsf", s.getPass());
	}
	
	@Then("Close the browser")
	public void closeTheBrowser() {
	   closeBrowers();
	}

}
