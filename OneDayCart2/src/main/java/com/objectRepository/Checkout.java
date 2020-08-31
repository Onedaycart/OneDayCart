package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {
	@FindBy(xpath="//select[@id='billing-address-select']")
	private WebElement Billingaddressdropdown;
	
	@FindBy(xpath="//input[@id='billing:firstname']")
	private WebElement firstnametextfield;
	 
	@FindBy(xpath="//input[@id='billing:lastname']")
	private WebElement lastnametextfield;
	
	@FindBy(xpath="//input[@id='billing:telephone']")
	private WebElement mobiletextfield;
	
	@FindBy(id="billing:city")
	private WebElement citytextfield;
	
	 @FindBy(id="billing:region_id")
	 private WebElement statedropdown;
	 
	 @FindBy(id="billing:postcode")
	 private WebElement postalcodetextfield;
	 
	 @FindBy(id="billing:country_id")
	 private WebElement countrydropdown;
	 
	 @FindBy(id="billing:land_mark")
	 private WebElement landmarktextfield;
	 
	 @FindBy(xpath="(//span[text()='Continue'])[1]")
	 private WebElement billingcontinue;
	 
	 @FindBy(xpath="(//span[text()='Continue'])[3]")
	 private WebElement shippingmethodcontinue;
	 
	 @FindBy(xpath="(//span[text()='Continue'])[4]")
	 private WebElement paymentcontinue;
	 
	 @FindBy(xpath="//input[@id='billing:street1']")
	 private WebElement addresstextfield;
	 
	 @FindBy(xpath="//input[@id='billing:save_in_address_book']")
	 private WebElement saveinaddressbook;
	
	
	
	
	
	public WebElement getBillingaddressdropdown(){
		return Billingaddressdropdown;
	}
	
	public WebElement getfirstnametextfield(){
		return firstnametextfield;
	}
	
	public WebElement getlastnametextfield(){
		return lastnametextfield;
	}
	
	public WebElement getmobiletextfield(){
		return mobiletextfield;
	}
	public WebElement getcitytextfield(){
		return citytextfield;
	}
	
	public 	WebElement getstatedropdown(){
		return statedropdown;
	}
	
	public WebElement getpostalcodetextfield(){
		return postalcodetextfield;
	}
	
	public WebElement getcountrydropdown(){
		return countrydropdown;
	}
	
	public WebElement getlandmarktextfield(){
		return landmarktextfield;
	}
	
	public WebElement getbillingcontinue(){
		return billingcontinue;
	}
	
	public WebElement getshippingmethodcontinue(){
		return shippingmethodcontinue;
	}
	
	public WebElement getpaymentcontinue(){
		return paymentcontinue;
	}
	
	public WebElement getaddresstextfield(){
		return addresstextfield;
	}
     
	public WebElement getsaveinaddressbook(){
		return saveinaddressbook;
	}
}
