package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpojo  extends BaseClass{
	public SignInpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//a[text()='Create new account']")
	private WebElement CreateNewAcc;
	
	@FindBy(name ="firstname")
	private WebElement Firstname;
	
	@FindBy(name = "lastname")
	private WebElement Surname;
	
	@FindBy(name = "reg_email__")
	private WebElement mail;
	
	@FindBy(name = "reg_passwd__")
	private WebElement pass;
	
	

	public WebElement getCreateNewAcc() {
		return CreateNewAcc;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getSurname() {
		return Surname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

		
}
