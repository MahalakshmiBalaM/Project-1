package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.SamPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fliplogin extends BaseClass{
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
	    launchUrl("https://www.flipkart.com/");
	}
	
	@When("To click login button")
	public void to_click_login_button() {
		SamPOJO s = new SamPOJO();
		clickbtn(s.getLogin());
	}

	@When("To pass the invalid mobile number in mobile number field")
	public void to_pass_the_invalid_mobile_number_in_mobile_number_field() {
		SamPOJO s = new SamPOJO();
		passText("98745632100", s.getPhno());
	}

	@When("To click the Request OTP button")
	public void to_click_the_Request_OTP_button() {
	    WebElement click = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
	    click.click();
	}

	@When("To check whether navigate to the next page or not")
	public void to_check_whether_navigate_to_the_next_page_or_not() {
	    System.out.println("To check your next page");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeBrowers(); 
	}


}
