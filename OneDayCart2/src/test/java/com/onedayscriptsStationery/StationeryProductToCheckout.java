package com.onedayscriptsStationery;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.Checkout;
import com.objectRepository.HomePage;
import com.objectRepository.Stationery;

public class StationeryProductToCheckout extends Base{
	@Test
	public void productCartTest()  {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.getgrocerylink();
		
		hp.getstationerylink().click();
		/*5.Click on Stationery in horizontal navigation bar*/
		cu.mouseHover(driver, hp.getstationerylink());
		hp.getstationerylink().click();
		String sexp="Buy Stationery Goods Online Kochi".replaceAll(" ", "");
		String sact=driver.getTitle().replaceAll(" ", "");
		Assert.assertEquals(sact, sexp);
		Stationery st=PageFactory.initElements(driver, Stationery.class);
		/*7.Click on Student Stationery in Category list*/
        st.getstudentstationerylink().click();
        wait.until(ExpectedConditions.elementToBeClickable(st.getapsaraPlatinumAddCart()));
        /*9.Click on  ADD TO CART of the product*/
        st.getapsaraPlatinumAddCart().click();
        Reporter.log(" APSARA PLATINUM PENCILS 10'S BOX was added to your shopping cart.",true);
        /*Scroll up the screen*/
        cu.scrollup(driver);
     
      // wait.until(ExpectedConditions.elementToBeClickable(hp.getviewCartButton()));
       hp.getCheckoutButton().click();
       String cexp="Checkout".replaceAll(" ", "");
       String cact=driver.getTitle().replaceAll(" ", "");
       Assert.assertEquals(cact, cexp);
       Checkout ch=PageFactory.initElements(driver,Checkout.class );
       ch.getBillingaddressdropdown().click();
       cu.selectVisibleText(ch.getBillingaddressdropdown(), "New Address");
       cu.scrollDown(driver);
       ch.getfirstnametextfield().clear();
       ch.getfirstnametextfield().sendKeys("Dhoni");
       ch.getlastnametextfield().clear();
       ch.getlastnametextfield().sendKeys("ms");
       ch.getmobiletextfield().clear();
       ch.getmobiletextfield().sendKeys("9141588109");
       ch.getaddresstextfield().clear();
       ch.getaddresstextfield().sendKeys("basavanagudi");
       ch.getcitytextfield().clear();
       ch.getcitytextfield().sendKeys("banglore");
      
       wait.until(ExpectedConditions.elementToBeClickable(ch.getstatedropdown())).click();
      
       cu.selectVisibleText(ch.getstatedropdown(), "Kerala");
       ch.getpostalcodetextfield().clear();
       ch.getpostalcodetextfield().sendKeys("682001");
       wait.until(ExpectedConditions.elementToBeClickable(ch.getcountrydropdown())).click();
      
       cu.selectVisibleText(ch.getcountrydropdown(), "India");
       ch.getlandmarktextfield().clear();
       ch.getlandmarktextfield().sendKeys("tyss");
       ch.getsaveinaddressbook().click();
       cu.scrollDown(driver);
       ch.getbillingcontinue().click();
      
       
       
       

}
}
