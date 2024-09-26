package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Secnario3 extends BaseClass {
	@Given("launch FF browser and maximize it")
	public void launch_FF_browser_and_maximize_it() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("Get the url of Scent Website")
	public void get_the_url_of_Scent_Website() {
	    launchUrl("https://scentarts.ae/");
	}

	@When("click the contactUs btn")
	public void click_the_contactUs_btn() {
		WebElement con = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
		con.click();
	}

	@When("Scroll down to form field")
	public void scroll_down_to_form_field() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//h2[text()='Reach Us At']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		scroll.click();
	}

	@When("To click the full name field and enter the name")
	public void to_click_the_full_name_field_and_enter_the_name() {
		WebElement name = driver.findElement(By.id("form-field-name"));
		name.sendKeys("Mahalakshmi");
	}

	@When("To click the company field and enter the company name")
	public void to_click_the_company_field_and_enter_the_company_name() {
		WebElement com = driver.findElement(By.id("form-field-email"));
		com.sendKeys("csdff");
	}

	@When("To click the phone number field and enter the phone number")
	public void to_click_the_phone_number_field_and_enter_the_phone_number() {
		WebElement ph = driver.findElement(By.name("form_fields[message]"));
		ph.sendKeys("9876543210");
	}

	@When("To click the mail field and enter the mail Id")
	public void to_click_the_mail_field_and_enter_the_mail_Id() {
		WebElement mail = driver.findElement(By.id("form-field-field_ea2bfcd"));
		mail.sendKeys("123@gmail.com");
	}

	@When("To click the country field and enter the country name")
	public void to_click_the_country_field_and_enter_the_country_name() {
		WebElement coun = driver.findElement(By.id("form-field-field_67f8bfa"));
		coun.sendKeys("defdasf");
	}

	@When("To click the mgs field and enter any mgs")
	public void to_click_the_mgs_field_and_enter_any_mgs() {
		WebElement mgs = driver.findElement(By.id("form-field-field_7094c9e"));
		mgs.sendKeys("Have a wonderfull day");
	}

	@When("To click the send btn")
	public void to_click_the_send_btn() {
		WebElement send = driver.findElement(By.xpath("//span[text()='Send']"));
		send.click();
	}

	@When("scroll down to see the map")
	public void scroll_down_to_see_the_map() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		WebElement map = driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[20]"));
		js1.executeScript("arguments[0].scrollIntoView(false)", map);
	}

	@Then("close the Scent Website")
	public void close_the_Scent_Website() {
	    closeBrowers();
	}

}
