package com.onedayscriptsStationery;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.HomePage;
import com.objectRepository.Stationery;

public class filterBrandStationery extends Base {
	@Test
	public void brandStationeryTest(){
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
    cu.scrollDown(driver);
    st.getbrandnamelink().click();
    Assert.assertEquals(sact, sact);
   
}
}