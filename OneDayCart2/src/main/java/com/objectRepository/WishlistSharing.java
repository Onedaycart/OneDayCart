package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistSharing {
	@FindBy(id="email_address")
	private WebElement Emailtextbox;
	
	@FindBy(id="rss_url")
	private WebElement checkboxcheck;
	
	@FindBy(xpath="//span[text()='Share Wishlist']")
	private WebElement shareWishlistbutton;
	
	
	
	
	
	
	public WebElement getEmailtextbox(){
		return Emailtextbox;	
	}
	
	public WebElement getcheckboxcheck(){
		return checkboxcheck;
	}
	
	public WebElement getshareWishlistbutton(){
		return shareWishlistbutton;
	}

}
