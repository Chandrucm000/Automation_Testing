package com.selenium.practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
	
		private WebDriver driver;
		
		 public void getURL(String url) {
		        driver.get(url);
		    }
		
		 
		 public CheckBoxPage(WebDriver driver) {
		        this.driver = driver;
		    }
		   
		
          public void clickCheckBox()
		    {
        	  driver.findElement(By.linkText("Checkboxes")).click();
		    }
		    
		    public  List<WebElement> checkBoxWebElements()
		    {
		    	return driver.findElements(By.xpath("//input[@type='checkbox']"));
		    } 
		    
       
	}
	
	
