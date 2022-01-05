package com.noorteck.qa.test;


import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;


public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args)  {
		
		
		
		
		CommonUI.openBrowser("chrome");
		initializeClassObj();
		CommonUI.navigate(signUpObj.url);
		testCaseOne();
		CommonUI.quitBrowser();
		
		
		
		CommonUI.openBrowser("chrome");
		initializeClassObj();
		CommonUI.navigate(signInObj.url);
		testCaseTwo();
		CommonUI.quitBrowser();
	
		
	}
	
	public static void testCaseOne()  {
		signUpObj.enterEmailAddress("@yahoo.com"); //inputted "johncena@yahoo.com" went to different page /users
		signUpObj.enterPasswordFIeld("123456");
		signUpObj.clickSignUpButton();
		if (homeObj.getHeadingText()) {
			System.out.println("Test Case: Success");
		} else {
			System.out.println("Test Case: Failed");
		}
		
	}
	
	public static void testCaseTwo() {
		signInObj.enterEmailAddressField("123waszdgf@yahoo.com");
		signInObj.enterPasswordField("123456");
		signInObj.clickSignInButton();
		homeObj.clickAddressesMenuButton();
		addressesObj.clickNewAddressButton();
		addressesObj.enterFirstNameField("John");
		addressesObj.enterLastNameField("Cena");
		addressesObj.enterPrimaryAddressField("123 Lol Ave");
		addressesObj.enterCityField("Gotham");
		addressesObj.selectState("VA");
		addressesObj.enterZipcodeField("22042");
		addressesObj.clickUnitedStatesRadioButton();
		addressesObj.enterAgeField("22");
		addressesObj.enterPhoneField("123-2334-3434");
		addressesObj.clickDancingRadioButton();
		addressesObj.enterNoteField("Automation is Fun");
		addressesObj.clickCreateAddress();
		addressesObj.clickListButton();
		addressesObj.displayRowColOne();
		addressesObj.displayRowColTwo();
		addressesObj.displayRowColThree();
		addressesObj.displayRowColFour();
		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FORGET  ***** INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FORGET  ***** CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

