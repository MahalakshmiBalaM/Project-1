package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class emaillog extends BaseClass{
	@Given("To launch the url of the EMail")
	public void to_launch_the_url_of_the_EMail() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://mail.google.com/");
	}

	@Given("To enter the phone numberin {string} phone number field")
	public void to_enter_the_phone_numberin_phone_number_field(String ph) {
	    WebElement pho = driver.findElement(By.id("identifierId"));
	    pho.sendKeys(ph);
	}

	@Given("To click the next option")
	public void to_click_the_next_option() {
	   WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
	   next.click();
	}

	@Then("Close browser")
	public void close_browser() {
	    closeBrowers();
	}

}
