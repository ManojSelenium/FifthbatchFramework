package com.rightstartpom.pages;

import com.rightstartpom.utility.WebDriverCode;

public class CreateAccountPage extends WebDriverCode{


	public void enter_FirstName(){
		enterText("","");
	}

	public void enter_LastName(){
		enterText("","");
	}

	public void enter_Email(){
		enterText("","");
	}
	public void enter_ConfirmEmail(){

	}
	public void enter_Password(){

	}
	public void enter_ConfirmPassword(){

	}
	public void click_SumbitButton() {
		
	}
	
	public void createUser() {
		enter_FirstName();
		enter_LastName();
		enter_Email();
		enter_ConfirmEmail();
		enter_Password();
		enter_ConfirmPassword();
		click_SumbitButton();
	}
}
