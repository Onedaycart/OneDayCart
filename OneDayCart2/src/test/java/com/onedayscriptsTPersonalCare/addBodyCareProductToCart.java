package com.onedayscriptsTPersonalCare;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.HomePage;
import com.objectRepository.PersonalCare;
import com.objectRepository.Shopping;
import com.objectRepository.Stationery;

public class addBodyCareProductToCart extends Base{
	@Test
	public void productCartTest() {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.getgrocerylink();
		
		hp.getpersonalcarelink().click();
		/*5.Click on Stationery in horizontal navigation bar*/
		cu.mouseHover(driver, hp.getpersonalcarelink());
		hp.getpersonalcarelink().click();
		String sexp="Buy Beauty & Hygiene products online kochi".replaceAll(" ", "");
		String sact=driver.getTitle().replaceAll(" ", "");
		Assert.assertEquals(sact, sexp);
		PersonalCare pc=PageFactory.initElements(driver, PersonalCare.class);
		/*7.Click on Student Stationery in Category list*/
        pc.getbodyCarelink().click();
        
        /*9.Click on  ADD TO CART of the product*/
        cu.scrollDown(driver);
       pc.getchandrikaBodyAddcart().click();
       Reporter.log("   CHANDRIKA GREEN SOAP REGULAR 70GM  was added to your shopping cart.",true);
        /*Scroll up the screen*/
        cu.scrollup(driver);
     
      // wait.until(ExpectedConditions.elementToBeClickable(hp.getviewCartButton()));
       hp.getviewCartButton().click();
       String cexp="Shopping Cart".replaceAll(" ", "");
       String cact=driver.getTitle().replaceAll(" ", "");
       Assert.assertEquals(cact, cexp);
       Shopping sp=PageFactory.initElements(driver, Shopping.class);
       //wait.until(ExpectedConditions.visibilityOf(sp.getclearshoppingcartbutton()));
       sp.getfristQtytTextField().sendKeys("2");
      // wait.until(ExpectedConditions.elementToBeClickable(sp.getupdateShoppingCartButton()));
       sp.getupdateShoppingCartButton().click();
    
       sp.getclearshoppingcartbutton().click();
       String acexp="Shopping Cart".replaceAll(" ", "");
       String acact=driver.getTitle().replaceAll(" ", "");
       Assert.assertEquals(acact, acexp);

		
		
	}


}
