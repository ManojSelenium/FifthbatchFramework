package com.rightstartpom.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rightstartpom.pages.CreateAccountPage;
import com.rightstartpom.pages.LandingPage;
import com.rightstartpom.pages.MyAccountPage;

public class CreateAccountTest {

	LandingPage landingPage;
	CreateAccountPage createaccountpage;
	MyAccountPage myAccountPageObj;
	@BeforeClass
	public void setUP() {
		
		 landingPage=new LandingPage();
		 createaccountpage=new CreateAccountPage();
		 myAccountPageObj=new MyAccountPage();
	}
	
	
	@Test
	public void AT_Verify_createaccount_with_valid_data() {
		landingPage.close_WelcomePopup();
		landingPage.click_Register();
		createaccountpage.createUser();
		Assert.assertEquals(myAccountPageObj.verify_CreateUser_SuccessMsg(), "Thank you for registering with rightstart");
	}
	
	@Test
	public void AT_Verify_createaccount_with_invalid_data() {
		
	}
}
