package com.onedayscriptsTPersonalCare;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLib.Base;
import com.objectRepository.HomePage;
import com.objectRepository.PersonalCare;

public class filterBrandEyeCare extends Base {
	@Test
	public void brandBodycareTest(){
	HomePage hp=PageFactory.initElements(driver, HomePage.class);
	hp.getgrocerylink();
	
	hp.getpersonalcarelink().click();
	/*5.Click on Stationery in horizontal navigation bar*/
	cu.mouseHover(driver, hp.getpersonalcarelink());
	hp.getpersonalcarelink().click();
	String sexp="Buy Beauty & Hygiene products online kochi".replaceAll(" ", "");
	String sact=driver.getTitle().replaceAll(" ", "");
	Assert.assertEquals(sact, sexp);
	PersonalCare pc=PageFactory.initElements(driver,PersonalCare.class);
	/*7.Click on Student Stationery in Category list*/
    pc.geteyeCarelink().click();
    cu.scrollDown(driver);
    pc.getbrandnamelink().click();
    Assert.assertEquals(sact, sact);
   
}


}
