package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamPOJO  extends BaseClass{
	public SamPOJO() {
		PageFactory.initElements(driver, this);
	}
	                //flipkart
	
	@FindBy(xpath = "//span[text()='Login']")
	public WebElement login;
	
	
	 @FindBy(xpath = "//input[@class='r4vIwl BV+Dqf']") 
	 public WebElement phno;
	
	
	
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getPhno() {
		return phno;
	}
	
	
}
