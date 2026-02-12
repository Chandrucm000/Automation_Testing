package com.selenium.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.practice.BaseClass;
import com.selenium.practice.DropDownPage;
import com.selenium.practice.ScreenshotUtil;

public class DropDownTest extends BaseClass {

	DropDownPage dropdownpage;

	@BeforeClass
	public void setup()
	{
		initializeDriver();
		dropdownpage = new DropDownPage(driver);
		dropdownpage.getURL("https://the-internet.herokuapp.com/");
	}
	
	@Test
	public void dropDown()
	{
		dropdownpage.ClickDropdown();
		dropdownpage.selectDropDown();
		//Assert.assertEquals(, null);
	}
	@AfterMethod
	public void screenshot() throws IOException
	{
		ScreenshotUtil.takeScreenshot(driver, "Drop_Down");
	}
	
	
	@AfterClass
	public void quitbrowser()
	{
		quitDriver();
	}
	
}
