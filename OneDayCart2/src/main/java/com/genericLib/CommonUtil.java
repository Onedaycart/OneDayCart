package com.genericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonUtil {
	public void mouseHover(WebDriver driver,WebElement ele){
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	 public void selectVisibleText(WebElement ele,String VisibleText){
		 Select sel=new Select(ele);
		 sel.selectByVisibleText(VisibleText);
		 
	 }
	 public void windowHandle(WebDriver driver,String path,String sheetname,int row,int cell){
		 FileLib lib=new FileLib();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i=windows.iterator();
		String pid = i.next();
		 String cid=i.next();
		 driver.switchTo().window(cid);
		 driver.findElement(By.linkText(lib.getExcelData(path, sheetname, row, cell))).click();
		 driver.switchTo().window(pid);
	 }
	 public void scrollup(WebDriver driver){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,-500)");
	 }
	 public void scrollDown(WebDriver driver){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
	 }
	

}