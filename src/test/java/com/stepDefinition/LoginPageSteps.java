package com.stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pages.RegistrationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginPageSteps extends BaseClass {
	RegistrationPage rp;
	
	@Given("user is in registraion page")
	public void user_is_in_registraion_page() {
		driver=launchBrowser();
        loadUrl("https://www.facebook.com/") ;
        maxi();
	}

	@When("user enters registration creditntials")
	public void user_enters_registration_creditntials(io.cucumber.datatable.DataTable data) {
		
		List<String> reg=data.asList();
		
		rp=new RegistrationPage();
		
		type(rp.getfName().get(0),reg.get(0));
		type(rp.getsName().get(0),reg.get(1));
		type(rp.getPhone().get(0),reg.get(2));
		type(rp.getcPassword().get(0),reg.get(3));
		SelectValue(rp.getDate().get(0),reg.get(4));
		SelectValue(rp.getMonth().get(0),reg.get(5));
		SelectValue(rp.getYear().get(0),reg.get(6));
		
		for (WebElement x : rp.getListGender())
		{
			String text = x.getText();
			if(text.equals(reg.get(7))) {
				x.click();
				System.out.println(text);
				}
			else if(text.equals(reg.get(7))) {
				x.click();
				System.out.println(text);
			}
			else if (text.equals(reg.get(7))) {
				x.click();
				System.out.println(text);
			}
			else {
				System.out.println("Invalid Gender");
			}
		}
		
	}
	
	@Then("user clicks on Sign Up and verified registration")
	public void user_clicks_on_Sign_Up_and_verified_registration() {
		
		btnClick(rp.getsUp().get(0));
		
		}



}
