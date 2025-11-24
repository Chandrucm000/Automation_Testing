package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPage {

	
	private WebDriver driver;
	
	 public void getURL(String url) {
	        driver.get(url);
	    }
	
	 
	 public DropDownPage(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public void ClickDropdown()
	 {
		 driver.findElement(By.linkText("Dropdown")).click();
	 }
	 
	 public String selectDropDown()
	    {
		 	
	     driver.findElements(By.xpath("//input[@type='checkbox']"));
	     WebElement drop=driver.findElement(By.xpath("//option[@value='2']"));
	     drop.click();
	     String value=drop.getText();
	    	return value;
	    }  
	 
}
