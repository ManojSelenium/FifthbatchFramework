package com.rightstartpom.pages;

import org.openqa.selenium.By;

import com.rightstartpom.ObjRepo.LandingPageProperty;
import com.rightstartpom.utility.WebDriverCode;

public class LandingPage extends WebDriverCode implements LandingPageProperty {

	
	
	
	public void close_WelcomePopup() {
		click(closeWelcomePopup);
	}
	
	public void click_Register() {
		click(registerButton);
	}
}
