package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
		 public static WebDriver driver;
		
		public static WebDriver launchBrowser() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAN REDDY\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Sowji\\Facebook\\driver\\chromedriver.exe");
		    return driver= new ChromeDriver();
		}
		public void loadUrl(String url) {
	         driver.get(url);
		}
		public void maxi() {
	       driver.manage().window().maximize();
		}
		public static String getUrl() {
			String url=driver.getCurrentUrl();
			return url;
			
	     }
		public void title() {
			String Title=driver.getTitle();
			System.out.println(Title);
	  	}
		public void type(WebElement e,String name) {
			e.sendKeys(name);
		}
		public static String getAttributeValue(WebElement e) {
			String name=e.getAttribute("value");
			return name;

		}
		public void btnClick(WebElement c) {
		    c.click();
	    }
		public void browserClose() {
	      driver.close();
		}
		public static void SelectValue(WebElement w,String s)
		{
			Select se=new Select(w);
			se.selectByValue(s);
		}
		public static void SelectIndex(WebElement w,int n)
		{
			Select se=new Select(w);
			se.selectByIndex(n);
		}
		public static void SelectText(WebElement w,String s)
		{
			Select se=new Select(w);
			se.selectByVisibleText(s);
		}

}
	