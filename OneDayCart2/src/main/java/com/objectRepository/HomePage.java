package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
		@FindBy(xpath="//li/a[text()='Log In']")
		private WebElement loginLink;
		
		
		@FindBy(xpath="//li/a[text()='Log Out']")
		private WebElement logOutLink;
		
		@FindBy(xpath="//div/button[@class=\"sendpulse-prompt-close\"]")
		private WebElement closePopUp;


		public WebElement getClosePopUp() {
			return closePopUp;
		}


		public WebElement getLoginLink() {
			return loginLink;
		}


		public WebElement getLogOutLink() {
			return logOutLink;
		}

}
