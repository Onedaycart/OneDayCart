package com.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.genericLib.FileLib;
import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;

public class Base {
	public WebDriver driver = null;
	public String path = "./src\\main\\java\\com\\testData\\commonData.properties";
	
	public static WebDriver driverListener = null;
	public FileLib flib = new FileLib();
	public  CommonUtil cu=new CommonUtil();
	public WebDriverWait wait;

	@BeforeClass(groups = { "smoke", "regression" })
	public void configBC() {
		/* open the browser */
		if (flib.getPropertyKeyValue(path, "browser").equals("chrome")) {
			driver = new ChromeDriver();
			driverListener = driver;
		}

		/* maximize the browser */
		driver.manage().window().maximize();

		/* using implicitly wait statement */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);

		/* Enter the url */
		driver.get(flib.getPropertyKeyValue(path, "url"));

		com.objectRepository.HomePage hp = PageFactory.initElements(driver, com.objectRepository.HomePage.class);

		hp.getLoginLink().click();

	}

	@BeforeMethod(groups = { "smoke", "regression" })
	public void configBM() {
		com.objectRepository.LoginPage lp = PageFactory.initElements(driver, com.objectRepository.LoginPage.class);
		lp.getEmailAddressTextfield().sendKeys(flib.getPropertyKeyValue(path, "username"));
		
      wait.until(ExpectedConditions.visibilityOf(lp.getEmailAddressTextfield()));
		lp.getPassowrdTextField().sendKeys(flib.getPropertyKeyValue(path, "password"));

		lp.getLoginButton().click();

	}

	@AfterMethod(groups = { "smoke", "regression" })
	public void configAM() {
		com.objectRepository.HomePage hp = PageFactory.initElements(driver, com.objectRepository.HomePage.class);
		hp.getClosePopUp().click();
		hp.getLogOutLink().click();
	}

	@AfterClass(groups = { "smoke", "regression" })
	public void configAC() {
		/* close the browser */
		driver.quit();

	}


}
