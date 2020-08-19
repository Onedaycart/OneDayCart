package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath="//input[@name=\"login[username]\"]")
	private WebElement emailAddressTextfield;
	
	
	@FindBy(xpath="//input[@name=\"login[password]\"]")
	private WebElement passowrdTextField;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;

	public WebElement getEmailAddressTextfield() {
		return emailAddressTextfield;
	}

	public WebElement getPassowrdTextField() {
		return passowrdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
