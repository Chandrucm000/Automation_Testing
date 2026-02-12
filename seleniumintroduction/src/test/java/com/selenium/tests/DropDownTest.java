package com.selenium.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.practice.BaseClass;
import com.selenium.practice.DropDownPage;

import utils.ScreenshotUtil;

public class DropDownTest extends BaseClass {

	DropDownPage dropdownpage;

	
	
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
	
}
