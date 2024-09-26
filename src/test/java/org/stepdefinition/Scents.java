package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scents extends BaseClass{
	@Given("launch chrome browser maximize")
	public void launch_chrome_browser_maximize() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("launch url of Scent application")
	public void launch_url_of_Scent_application() {
	   launchUrl("https://scentarts.ae/");
	}

	@When("To click About us btn")
	public void to_click_About_us_btn() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ab = driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
		ab.click();
	}

	@When("To scroll down to areas of scenting")
	public void to_scroll_down_to_areas_of_scenting() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement areas = driver.findElement(By.xpath("//h2[contains(text(),'AREAS')]"));
		js.executeScript("arguments[0].scrollIntoView(false)", areas);
		areas.click();
	}

	@When("To click differnt arease\\(hotel ,office , Airport)")
	public void to_click_differnt_arease_hotel_office_Airport() throws InterruptedException {
		Thread.sleep(3000);
		WebElement hotels = driver.findElement(By.xpath("//a[text()='Hotels']"));
		hotels.click();
		
		WebElement office = driver.findElement(By.xpath("//a[text()='Offices']"));
		office.click();
		
		WebElement ports = driver.findElement(By.xpath("//a[text()='Airports Lounges']"));
		ports.click();
	}

	@Then("close the browser")
	public void close_the_browser() {
	   closeBrowers();
	}
	
	


}
