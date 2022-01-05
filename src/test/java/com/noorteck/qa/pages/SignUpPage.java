package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import java.util.Random;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {
	
	@FindBy(id = "user_email")
	WebElement emailAddressField;
	
	@FindBy(id = "user_password")
	WebElement userPasswordField;
	
	@FindBy(xpath = "//*[@value='Sign up']")
	WebElement signUpButton;
	
	@FindBy(xpath = "//*[@data-test='sign-in']")
	WebElement signInButton;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String url = "http://a.testaddressbook.com/sign_up";
	
	
		
	public void enterEmailAddress(String emailField) {
		Random rando = new Random();
		String characters = "0123456789abcdefghijklmnopqrstuvwxyz";
		int place = rando.nextInt(characters.length());
		enter(emailAddressField, characters.substring(place, place+5) + emailField);
	}
	
	public void enterPasswordFIeld(String passwordField) {
		enter(userPasswordField, passwordField);
	}
	
	public void clickSignUpButton() {
		click(signUpButton);
	}
	
	public void clickSignInButton() {
		click(signInButton);
	}
	

}
