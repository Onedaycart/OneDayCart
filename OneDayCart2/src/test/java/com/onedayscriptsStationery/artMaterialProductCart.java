

package com.onedayscriptsStationery;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.HomePage;
import com.objectRepository.Shopping;
import com.objectRepository.Stationery;

public class artMaterialProductCart extends Base{
	@Test
	public void productCartTest() {
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
        st.getartmaterialslink().click();
        wait.until(ExpectedConditions.elementToBeClickable(st.getfaberCastellAddCart()));
        /*9.Click on  ADD TO CART of the product*/
        st.getfaberCastellAddCart().click();
        Reporter.log("  FABER CASTELL POSTER COLOURS 10ML 6 SHADES BOX was added to your shopping cart.",true);
        /*Scroll up the screen*/
        cu.scrollup(driver);
       
       // wait.until(ExpectedConditions.visibilityOf(hp.getviewCartButton()));
        hp.getviewCartButton().click();
        String cexp="Shopping Cart".replaceAll(" ", "");
        String cact=driver.getTitle().replaceAll(" ", "");
        Assert.assertEquals(cact, cexp);
        Shopping sp=PageFactory.initElements(driver, Shopping.class);
        //wait.until(ExpectedConditions.visibilityOf(sp.getclearshoppingcartbutton()));
        sp.getfristQtytTextField().sendKeys("2");
        //wait.until(ExpectedConditions.elementToBeClickable(sp.getupdateShoppingCartButton()));
        sp.getupdateShoppingCartButton().click();
     
        sp.getclearshoppingcartbutton().click();
        String acexp="Shopping Cart".replaceAll(" ", "");
        String acact=driver.getTitle().replaceAll(" ", "");
        Assert.assertEquals(acact, acexp);
		
		
	}

}
