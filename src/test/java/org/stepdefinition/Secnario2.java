package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Secnario2 extends BaseClass {
	@Given("launch firefox browser maximize")
	public void launch_firefox_browser_maximize() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("launch url of Scent website")
	public void launch_url_of_Scent_website() {
	    launchUrl("https://scentarts.ae/");
	}

	@When("To click Our service btn")
	public void to_click_Our_service_btn() {
		WebElement ser = driver.findElement(By.xpath("(//a[text()='Our Services'])[1]"));
		ser.click();
	}

	@When("To scroll down to contact us btn")
	public void to_scroll_down_to_contact_us_btn() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement con = driver.findElement(By.xpath("(//span[text()='Contact Us'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)", con);
		con.click();
	}

	@When("To click contact us btn")
	public void to_click_contact_us_btn() {
//		WebElement con = driver.findElement(By.xpath("(//span[text()='Contact Us'])[1]"));
//		con.click();
	}

	@Then("exit the browser")
	public void exit_the_browser() {
	   closeBrowers();
	}

}
