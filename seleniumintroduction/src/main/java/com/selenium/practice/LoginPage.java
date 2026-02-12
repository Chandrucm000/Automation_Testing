package com.selenium.practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ConfigReader;
import utils.WaitUtil;

public class LoginPage {
	
	private WebDriver driver;
	private WaitUtil wait;

	    
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtil(driver);
    }
	
	public void ClickLogin()
	{
	wait.waitForClickable(By.xpath("//a[text()='Login']")).click();
	}

	public void MobileNo()
	{
		String mobile = ConfigReader.getProperty("mobile");
        wait.waitForVisibility(By.xpath("//input[@type='text' and contains(@class,'c3Bd2c')]")).sendKeys(mobile);
        System.out.println(mobile);
        
	}
	
	
}
