package com.selenium.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.practice.BaseClass;
import com.selenium.practice.LoginPage;

import utils.ConfigReader;
//import com.selenium.practice.LoginPage;

public class LoginTest extends BaseClass {
	
	LoginPage loginbutton;
	LoginPage enterMobile;

	@BeforeMethod
    public void setupPage() {
        loginbutton = new LoginPage(driver);  
        enterMobile = new LoginPage(driver);
    }
	
	
    @Test
    public void loginTest() {
    	loginbutton.ClickLogin();
    	enterMobile.MobileNo();
    }
}