package com.selenium.tests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.practice.BaseClass;
import com.selenium.practice.FormPage;
import utils.ConfigReader;
//import com.selenium.practice.LoginPage;
import utils.ScreenshotUtil;

public class FormTest extends BaseClass {
	
	FormPage FillForm;
	
	

	@BeforeClass
    public void setupPage() {
		//FillForm = new FormPage(driver);  
       // enterMobile = new LoginPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%'");
    }
	
	//using config.property file
   /* @Test
    public void formTest() {
    	FillForm.enterNameDetails();
    	FillForm.enterGender();
    	FillForm.enterMobile();
    	FillForm.enterDOB();
    	FillForm.enterSubject();
    	FillForm.selectHobbies();
    	FillForm.selectFile();
    	FillForm.enterAddress();
    	FillForm.enterState();
    	FillForm.enterCity();
    	FillForm.submission();
    }*/
	
	
	//using Excel file
	
	@Test(dataProvider = "formData",
	          dataProviderClass = TestDataProvider.class)
	    public void submitFormTest(
	            String firstname,
	            String lastname,
	            String email,
	            String gender,
	            String mobile,
	            String dob,
	            String subject,
	            String hobbies,
	            String picture,
	            String currentaddress,
	            String state,
	            String city) {

		driver.get(ConfigReader.getProperty("url"));
	        FormPage form = new FormPage(driver);

	        form.enterFirstName(firstname);
	        form.enterLastName(lastname);
	        form.enterEmail(email);
	        form.enterGender(gender);
	        form.enterMobile(mobile);
	        form.enterDOB(dob);
	        form.enterSubject(subject);
	        form.selectHobbies(hobbies);
	        form.selectFile(picture);
	        form.enterAddress(currentaddress);
	        form.enterState(state);
	        form.enterCity(city);
	        form.submission();
	        
	        
	}

   
    @AfterMethod
	public void screenshot() throws IOException
	{
		ScreenshotUtil.takeScreenshot(driver, "FormSubmission");
	}
    
    @AfterClass
    public void quit()
    {
    	driver.close();
    }
}