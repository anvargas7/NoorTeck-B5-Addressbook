package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[@data-test= 'home']")
	WebElement homeButton;

	@FindBy(xpath = "//*[@data-test= 'sign-in']")
	WebElement signInButton;

	@FindBy(xpath = "//*[text()='Welcome to Address Book']")
	WebElement headingText;

	@FindBy(xpath = "//*[@data-test='addresses']")
	WebElement addressesMenuButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHomeButton() {
		click(homeButton);
	}

	public void signInButton() {
		click(homeButton);
	}

	public boolean getHeadingText() {
		return isDisplayed(headingText);
	}

	public void clickAddressesMenuButton() {
		click(addressesMenuButton);
	}

}
