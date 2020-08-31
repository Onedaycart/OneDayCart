package com.onedayscriptsTPersonalCare;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.HomePage;
import com.objectRepository.MyWishlist;
import com.objectRepository.PersonalCare;
import com.objectRepository.Shopping;

public class UpdateWishlistOfPersonalCareProduct extends Base {
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
      
        //9.Click on  ADD TO CART of the product
       
        pc.getchandrikaBodyAddcart().click();
        Reporter.log("   CHANDRIKA GREEN SOAP REGULAR 70GM  was added to your shopping cart.",true);
       // Scroll up the screen
        cu.scrollup(driver);
     
       //wait.until(ExpectedConditions.visibilityOf(hp.getviewCartButton()));
       hp.getviewCartButton().click();
       String cexp="Shopping Cart".replaceAll(" ", "");
       String cact=driver.getTitle().replaceAll(" ", "");
       Assert.assertEquals(cact, cexp);
       Shopping sp=PageFactory.initElements(driver, Shopping.class);
       //wait.until(ExpectedConditions.elementToBeClickable(sp.getmoveToWishlist()));
       sp.getmoveToWishlist().click();
       Reporter.log("CHANDRIKA GREEN SOAP REGULAR 70GM  has been moved to wishlist Wishlist",true);
        sp.getMyWishlistlink().click();
        String wexp="My Wishlist".replaceAll(" ", "");
        String wact=driver.getTitle().replaceAll(" ", "");
        Assert.assertEquals(wact, wexp);
        cu.scrollDown(driver);
        MyWishlist mw=PageFactory.initElements(driver, MyWishlist.class);
        mw.getEditFirstitemlink().sendKeys("2");
        mw.getUpdateWishlistbutton().click();

		
		
	}

}
