package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalCare {
	@FindBy(xpath="//a[text()='BODY CARE']")
    private WebElement bodyCarelink;
    
    @FindBy(xpath="//a[text()='EYE CARE']")
    private WebElement eyeCarelink;
    
    
    
    @FindBy(xpath="//input[@name='rel_price_1478']/following-sibling::button")
    private WebElement chandrikaBodyAddcart;
    
    @FindBy(xpath="//input[@name='rel_price_3330']/following-sibling::button")
    private WebElement maybellineEyeAddcart;
    
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
	 
	@FindBy(xpath="//label[text()='Sort By']/following-sibling::select")
	private WebElement sortByDropdownlink;
	
	
	
	
	
	
	
	
	public WebElement getbodyCarelink(){
		return bodyCarelink;
	}
	
	public WebElement geteyeCarelink(){
		return eyeCarelink;
	}
	
	
	public WebElement getchandrikaBodyAddcart(){
		return chandrikaBodyAddcart;
	}
	
	public WebElement getmaybellineEyeAddcart(){
		return  maybellineEyeAddcart;
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
