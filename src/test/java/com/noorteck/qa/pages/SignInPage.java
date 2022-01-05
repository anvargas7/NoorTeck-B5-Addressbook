package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{
	
	
	
	@FindBy(id = "session_email")
	WebElement emailAddressField;
	
	@FindBy(id= "session_password")
	WebElement passwordField;
	
	@FindBy(name = "commit")
	WebElement signInButton;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String url = "http://a.testaddressbook.com/sign_in";
	
	public void enterEmailAddressField(String emailAddress) {
		enter(emailAddressField, emailAddress);
	}
	
	public void enterPasswordField(String password) {
		enter(passwordField, password);
	}
	
	public void clickSignInButton() {
		click(signInButton);
	}

}
