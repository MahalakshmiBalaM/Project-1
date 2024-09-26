package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Icic extends BaseClass{
	@Given("launch the browser and maximize window")
	public void launch_the_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("launch the url of the ICIC BANK application")
	public void launch_the_url_of_the_ICIC_BANK_application() {
	    launchUrl("https://www.icicibank.com/");
	}

	@When("To click the login btn")
	public void to_click_the_login_btn() throws InterruptedException {
		Thread.sleep(3000);
		WebElement log= driver.findElement(By.xpath("//span[text()='Login']"));
		log.click();
	}

	@When("To click personal")
	public void to_click_personal() throws InterruptedException {
		Thread.sleep(3000);
	    WebElement per = driver.findElement(By.xpath("//a[text()='Personal ']"));
	    per.click();
	}

	@Then("close all browser")
	public void close_all_browser() {
	    closeBrowers();
	}

}
