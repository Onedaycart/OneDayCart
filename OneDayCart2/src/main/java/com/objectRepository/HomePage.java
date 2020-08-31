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
	
	@FindBy(xpath="//a[contains(text(),'GROCERY')]")
	 private WebElement grocerylink;
	
     @FindBy(xpath="//a[contains(text(),'STATIONERY')]")
     private WebElement stationerylink;
     
     @FindBy(xpath="//a[contains(text(),'PERSONAL CARE')]")
     private WebElement personalcarelink;
     
     @FindBy(xpath="//span[text()='Shopping cart']")
     private WebElement shoppingCartlink;
     
     @FindBy(xpath="//a[text()='View cart']")
     private WebElement viewCartButton;
     
     @FindBy(xpath="//span[text()='Checkout']")
	private WebElement CheckoutButton;
     
     


	public WebElement getClosePopUp() {
		return closePopUp;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	public WebElement getgrocerylink(){
		return grocerylink;
		
	}
	public WebElement getstationerylink(){
		return stationerylink;
		
	}
	public WebElement getpersonalcarelink(){
		return personalcarelink;
		
	}
	 
	public WebElement getshoppingCartlink(){
		return shoppingCartlink;
	}
	public WebElement getviewCartButton(){
		return viewCartButton;
	}
	
	public WebElement getCheckoutButton(){
		return  CheckoutButton;
	}
	
}
