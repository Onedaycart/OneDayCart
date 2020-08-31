package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlist {
	@FindBy(xpath="//span[text()='Update Wishlist']")
	private  WebElement UpdateWishlistbutton;
	
	@FindBy(xpath="(//th[text()='Add to Cart']/ancestor::thead/following::tbody/child::tr/descendant::input)[1]")
	private WebElement EditFirstitemlink;
	 
	@FindBy(xpath="//span[text()='Share Wishlist']")
	private WebElement shareWishlistButton;
	
	
	
	public WebElement getUpdateWishlistbutton(){
		return UpdateWishlistbutton;
	}
	
	public WebElement getEditFirstitemlink(){
		return EditFirstitemlink;
	}
	
	
	public WebElement getshareWishlistButton(){
		return shareWishlistButton;
	}

	

}
