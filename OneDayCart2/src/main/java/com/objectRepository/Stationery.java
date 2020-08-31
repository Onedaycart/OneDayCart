package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Stationery {
	@FindBy(xpath="//a[text()='STUDENTS STATIONERY']")
	private WebElement studentstationerylink;
	
	@FindBy(xpath="//a[text()='ART MATERIALS']")
	private WebElement artmaterialslink;
	
	@FindBy(xpath="//a[contains(text(),'ART MATERIALS')]/parent::li/following-sibling::li")
	private WebElement officeneedslink;
	
	@FindBy(xpath="(//dt[text()='Price']/following-sibling::dd/child::ol/li)[1] ")
	private WebElement priceFilterlink;
	 
	@FindBy(xpath="//dt[text()='Brand']/following-sibling::dd[@class='last odd']/descendant::li[1]")
	private WebElement brandnamelink;
	 
	@FindBy(xpath="//option[contains(text(),' Best Value')]")
	private WebElement bestvaluelink;
	
	@FindBy(xpath="//option[contains(text(),' Name')]")
	private WebElement namelink;
	
	@FindBy(xpath="//option[contains(text(),' Price')]")
	private WebElement pricelink;
	
	@FindBy(xpath="//input[@name='rel_price_6841']/following-sibling::button")
	private WebElement apsaraPlatinumAddCart;
	
	@FindBy(xpath="//a[text()='My Cart']")
	private WebElement mycartlink;
	
	@FindBy(xpath="//input[@name='rel_price_6820']/following-sibling::button")
	private WebElement faberCastellAddCart;
	
	@FindBy(xpath="//input[@name='rel_price_6778']/following-sibling::button")
	private WebElement bvcShagunAddcart;
	 
	@FindBy(xpath="//label[text()='Sort By']/following-sibling::select")
	private WebElement sortByDropdownlink;
	 
	public WebElement getstudentstationerylink(){
		return studentstationerylink;
	}
	public WebElement getartmaterialslink(){
		return artmaterialslink;
	}
	public WebElement getofficeneedslink(){
		return officeneedslink;
	}
	 
	public WebElement getbestvaluelink(){
		return bestvaluelink;
		
	}
	
	public WebElement getnamelink(){
		return namelink;
	
	}
	
	public WebElement getpricelink(){
		return pricelink;
	}
	
	public WebElement getapsaraPlatinumAddCart(){
		return apsaraPlatinumAddCart;
	}	
	
	public WebElement getmycartlink(){
		return  mycartlink;
	}
	
	public WebElement getfaberCastellAddCart(){
		return faberCastellAddCart;
	}
	 public WebElement getbvcShagunAddcart(){
		 return bvcShagunAddcart;
	 }
	 public WebElement getbrandnamelink(){
		 return brandnamelink;
	 }
	  public WebElement getpriceFilterlink(){
		  return priceFilterlink;
	  }
	  
	  public WebElement getsortByDropdownlink(){
		  return sortByDropdownlink;
	  }


}
