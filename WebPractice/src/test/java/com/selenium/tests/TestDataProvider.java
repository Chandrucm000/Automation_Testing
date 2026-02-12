package com.selenium.tests;

import org.testng.annotations.DataProvider;

import utils.ExcelUtil;

public class TestDataProvider {
	
	 @DataProvider(name = "formData")
	    public static Object[][] getFormData() {
	        return ExcelUtil.getTestData("Data");
	    }

}
