package com.selenium.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import com.selenium.practice.BaseClass;
import com.selenium.practice.CheckBoxPage;

import utils.ScreenshotUtil;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class CheckBoxTest extends BaseClass {
    CheckBoxPage checkboxPage;

	@BeforeClass
	public void setup()
	{
		initializeDriver();
		checkboxPage = new CheckBoxPage(driver);
		checkboxPage.getURL("https://the-internet.herokuapp.com/");
		
	}
	
	@Test
	
	public void CheckBox()
	{
		checkboxPage.clickCheckBox();
		
		List<WebElement> boxes=checkboxPage.checkBoxWebElements();
		
		 int i=1;
	        for(WebElement check:boxes)
	        {
	        	
	         	if(check.isSelected())
	        	{
	        		System.out.println("Checkbox "+i+" - Selected");
	        	}
	        	else
	        	{
	        		System.out.println("Checkbox "+i+" - Not Selected");
	        	}
	        	i++;
	        }
	        
	       
	}
	

	@AfterMethod
	public void screenshot() throws IOException
	{
		ScreenshotUtil.takeScreenshot(driver, "Check_Box");
	}
	
	
	/*@AfterClass
	public void quitbrowser()
	{
		quitDriver();
	}*/
	
}
