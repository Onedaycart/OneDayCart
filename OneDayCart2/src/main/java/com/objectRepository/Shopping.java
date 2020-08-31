package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping {
	@FindBy(xpath="//span[text()='Clear Shopping Cart']")
	private WebElement clearshoppingcartbutton;
     
     @FindBy(xpath="//span[text()='Update Shopping Cart']")
     private WebElement updateShoppingCartButton;
     
     @FindBy(xpath="//span[text()='Continue Shopping']")
     private WebElement continueShoppingButton;
     
     @FindBy(xpath="//table[@id='shopping-cart-totals-table']/following-sibling::ul/descendant::button")
     private WebElement proceedToCheckoutButton;
     
     @FindBy(xpath="//tbody/descendant::input[1]")
     private WebElement fristQtytTextField;
     
     @FindBy(xpath="(//a[text()='Move'])[1]")
     private WebElement moveToWishlist;
      
     @FindBy(xpath="//a[contains(text(),'My Wishlist')]")
     private WebElement MyWishlistlink;
     
     
      
	 
	public WebElement getclearshoppingcartbutton(){
		return clearshoppingcartbutton;
	}
	
	public WebElement getupdateShoppingCartButton(){
		return updateShoppingCartButton;
	}
	
	public WebElement getcontinueShoppingButton(){
		return continueShoppingButton;
	}
	
	public WebElement getproceedToCheckoutButton(){
		return proceedToCheckoutButton;
	}
	
	public WebElement getfristQtytTextField(){
		return fristQtytTextField;
	}
	 public WebElement getmoveToWishlist(){
		 return moveToWishlist;
	 }
	 
	 public WebElement getMyWishlistlink(){
		 return MyWishlistlink;
	 }
	     
	
    

}
