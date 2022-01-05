package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(xpath = "//*[@data-test='create']")
	WebElement newAddressButton;

	@FindBy(id = "address_first_name")
	WebElement firstNameField;

	@FindBy(id = "address_last_name")
	WebElement lastNameField;

	@FindBy(id = "address_street_address")
	WebElement primaryAddressField;

	@FindBy(id = "address_secondary_address")
	WebElement secondaryAddressField;

	@FindBy(id = "address_city")
	WebElement cityField;

	@FindBy(id = "address_state")
	WebElement stateDropDown;

	@FindBy(id = "address_zip_code")
	WebElement zipcodeField;

	@FindBy(id = "address_country_us")
	WebElement unitedStatesRadioButton;

	@FindBy(id = "address_country_canada")
	WebElement canadaRadioButton;

	@FindBy(id = "address_birthday")
	WebElement birthdayDate;

	@FindBy(id = "address_color")
	WebElement colorButton;

	@FindBy(id = "address_age")
	WebElement ageField;

	@FindBy(id = "address_website")
	WebElement websiteField;

	@FindBy(id = "address_picture")
	WebElement pictureButton;

	@FindBy(id = "address_phone")
	WebElement phoneField;

	@FindBy(id = "address_interest_climb")
	WebElement climbingRadioButton;

	@FindBy(id = "address_interest_dance")
	WebElement dancingRadioButton;

	@FindBy(id = "address_interest_read")
	WebElement readingRadioButton;

	@FindBy(id = "address_note")
	WebElement noteField;

	@FindBy(xpath = "//*[@value='Create Address']")
	WebElement createAddressButton;

	@FindBy(xpath = "//*[@data-test='list']")
	WebElement listButton;

	@FindBy(xpath = "//*[class='table']")
	WebElement addressesTable;

	@FindBy(xpath = "//*[@class=\"container\"]/table/tbody/tr/td[1]")
	WebElement rowColOne;
	
	@FindBy(xpath = "//*[@class=\"container\"]/table/tbody/tr/td[2]")
	WebElement rowColTwo;
	
	@FindBy(xpath = "//*[@class=\"container\"]/table/tbody/tr/td[3]")
	WebElement rowColThree;

	@FindBy(xpath = "//*[@class=\"container\"]/table/tbody/tr/td[4]")
	WebElement rowColFour;


	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickNewAddressButton() {
		click(newAddressButton);
	}

	public void enterFirstNameField(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLastNameField(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterPrimaryAddressField(String primaryAddress) {
		enter(primaryAddressField, primaryAddress);
	}

	public void enterSecondaryAddressFIeld(String secondaryAddress) {
		enter(secondaryAddressField, secondaryAddress);
	}

	public void enterCityField(String city) {
		enter(cityField, city);
	}

	public void selectState(String state) {
		selectFromDropdown(stateDropDown, "value", state);
	}

	public void enterZipcodeField(String zipcode) {
		int maxLength = 5;
		if (zipcode.length() > maxLength) {
			zipcode = zipcode.substring(0, maxLength);
		}
		enter(zipcodeField, zipcode);
	}

	public void clickUnitedStatesRadioButton() {
		click(unitedStatesRadioButton);
	}

	public void clickCanadaRadioButton() {
		click(canadaRadioButton);
	}

	public void enterAgeField(String age) {
		enter(ageField, age);
	}

	public void enterWebsiteField(String website) {
		enter(websiteField, website);
	}

	public void enterPhoneField(String phone) {
		enter(phoneField, phone);
	}

	public void clickClimbingRadioButton() {
		click(climbingRadioButton);
	}

	public void clickDancingRadioButton() {
		click(dancingRadioButton);
	}

	public void clickReadingRadioButton() {
		click(readingRadioButton);
	}

	public void enterNoteField(String note) {
		enter(noteField, note);
	}

	public void clickCreateAddress() {
		click(createAddressButton);
	}

	public void clickListButton() {
		click(listButton);
	}

	public void displayRowColOne() {
		isDisplayed(rowColOne);
		String value = rowColOne.getText();
		System.out.println(value);
	}
	public void displayRowColTwo() {
		isDisplayed(rowColTwo);
		String value = rowColTwo.getText();
		System.out.println(value);
	}
	public void displayRowColThree() {
		isDisplayed(rowColThree);
		String value = rowColThree.getText();
		System.out.println(value);
	}
	public void displayRowColFour() {
		isDisplayed(rowColFour);
		String value = rowColFour.getText();
		System.out.println(value);
	}
}
