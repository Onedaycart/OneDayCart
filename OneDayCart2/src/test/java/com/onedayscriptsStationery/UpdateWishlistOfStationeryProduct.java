package com.onedayscriptsStationery;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.HomePage;
import com.objectRepository.MyWishlist;
import com.objectRepository.Shopping;
import com.objectRepository.Stationery;

public class UpdateWishlistOfStationeryProduct extends Base{
	
		@Test
		public void updateWishlisttTest() {
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
	       // wait.until(ExpectedConditions.elementToBeClickable(st.getapsaraPlatinumAddCart()));
	        /*9.Click on  ADD TO CART of the product*/
	        st.getapsaraPlatinumAddCart().click();
	        Reporter.log(" APSARA PLATINUM PENCILS 10'S BOX was added to your shopping cart.",true);
	        /*Scroll up the screen*/
	        cu.scrollup(driver);
	     
	       //wait.until(ExpectedConditions.visibilityOf(hp.getviewCartButton()));
	       hp.getviewCartButton().click();
	       String cexp="Shopping Cart".replaceAll(" ", "");
	       String cact=driver.getTitle().replaceAll(" ", "");
	       Assert.assertEquals(cact, cexp);
	       Shopping sp=PageFactory.initElements(driver, Shopping.class);
	       //wait.until(ExpectedConditions.elementToBeClickable(sp.getmoveToWishlist()));
	       sp.getmoveToWishlist().click();
	       Reporter.log("APSARA PLATINUM PENCILS 10'S BOX has been moved to wishlist Wishlist",true);
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
