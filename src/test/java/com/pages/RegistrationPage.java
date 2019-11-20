package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RegistrationPage extends BaseClass{
      public RegistrationPage() {
         PageFactory.initElements(driver, this);
     }
     @FindBy(id="u_0_m")
     private List<WebElement> fName;
     
     @FindBy(id="u_0_o")
     private List<WebElement> sName;
     
     @FindBy(id="u_0_r")
     private List<WebElement> phone;
     
     @FindBy(id="u_0_w")
     private List<WebElement> cPassword;
     
     @FindBy(id="day")
     private List<WebElement> date;
     
     @FindBy(id="month")
     private List<WebElement> month;
     
     @FindBy(id="year")
     private List<WebElement> year;
     
     @FindBy(xpath="//label[@class='_58mt']")
     private List<WebElement> listGender;
     
     @FindBy(xpath="//button[@name='websubmit']")
     private List<WebElement> sUp;
     
     public List<WebElement> getfName() {
		return fName;
	}

	public List<WebElement> getsName() {
		return sName;
	}

	public List<WebElement> getPhone() {
		return phone;
	}

	public List<WebElement> getcPassword() {
		return cPassword;
	}

	public List<WebElement> getDate() {
		return date;
	}

	public List<WebElement> getMonth() {
		return month;
	}

	public List<WebElement> getYear() {
		return year;
	}

	public List<WebElement> getListGender() {
		return listGender;
	}

	public List<WebElement> getsUp() {
		return sUp;
	}
	
     
  }
