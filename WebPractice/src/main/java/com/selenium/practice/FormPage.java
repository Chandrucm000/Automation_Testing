package com.selenium.practice;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigReader;
import utils.WaitUtil;

public class FormPage {
	
	private WebDriver driver;
	private WaitUtil wait;

	    
	public FormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtil(driver);
    }
	
	public void enterFirstName(String firstName)
	{
		driver.findElement(By.id("firstName")).sendKeys(firstName);
        
	}
	public void enterLastName(String lastname)
	{
		 driver.findElement(By.id("lastName")).sendKeys(lastname);
        
	}
	public void enterEmail(String email)
	{
		//String email = ConfigReader.getProperty("email");
		
        driver.findElement(By.id("userEmail")).sendKeys(email);
        
	}
        
	public void enterGender(String gender) {
		//String input = ConfigReader.getProperty("gender");
		String input = gender.substring(0, 1).toUpperCase()+ gender.substring(1).toLowerCase();
		WebElement label = wait.waitForClickable(By.xpath("//label[text()='" + input + "']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", label);		
	}

	public void enterMobile(String mobile) {
		//String mobile = ConfigReader.getProperty("mobile");
		driver.findElement(By.id("userNumber")).sendKeys(mobile);
		
	}

	public void enterDOB(String dob) {
		//String dob = ConfigReader.getProperty("dob");
		String[] dobArr=dob.split("-");
		String dd=dobArr[0];
		String mm=dobArr[1];
		String yy=dobArr[2];
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		WebElement dobelement=wait.waitForClickable(By.id("dateOfBirthInput"));
		js.executeScript("arguments[0].scrollIntoView(true);", dobelement);
	    js.executeScript("arguments[0].click();", dobelement);
		
	    wait.waitForClickable(By.xpath("//select[@class='react-datepicker__month-select']")).click();
	    WebElement mmelement=wait.waitForClickable(By.xpath("//select[@class='react-datepicker__month-select']"));

		Select month=new Select(mmelement);
		month.selectByVisibleText(mm);
		
		wait.waitForClickable(By.xpath("//select[@class='react-datepicker__year-select']")).click();
	    WebElement yyelement=wait.waitForClickable(By.xpath("//select[@class='react-datepicker__year-select']"));

		Select year=new Select(yyelement);
		year.selectByVisibleText(yy);
		
		By dayLocator =By.xpath("//div[contains(@class,'react-datepicker__day') " +
			    "and text()='" + dd + "' " +
			    "and not(contains(@class,'outside-month'))]");
		
		WebElement dayElement = wait.waitForClickable(dayLocator);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", dayElement);
		
	}

	public void enterSubject(String subject) {
		//String subject = ConfigReader.getProperty("subject");
				String[] subArr = subject.split(",");

	    for (String sub : subArr) {
		
	    	WebElement subelement=driver.findElement(By.id("subjectsInput"));
	    	subelement.sendKeys(sub.trim());
	    	subelement.sendKeys(Keys.ENTER);
	    }
		
	}

	public void selectHobbies(String hobbies) {
		//String input = ConfigReader.getProperty("hobbies");
		
		String[] hobbiess = hobbies.split(",");

	    for (String hobby : hobbiess) {
	        driver.findElement(
	            By.xpath("//label[normalize-space()='" + hobby.trim() + "']")
	        ).click();
	    }
	}

	public void selectFile(String picture) {
		//String picture = ConfigReader.getProperty("picture");
		
		WebElement upload=driver.findElement(By.id("uploadPicture"));
		upload.sendKeys(picture);
		
		
	}

	public void enterAddress(String currentaddress) {
		//String currentaddress = ConfigReader.getProperty("currentaddress");
		
		driver.findElement(By.id("currentAddress")).sendKeys(currentaddress);
		
	}

	public void enterState(String state) {
		//String state = ConfigReader.getProperty("state");
		WebElement st=driver.findElement(By.id("react-select-3-input"));
		st.sendKeys(state);
		st.sendKeys(Keys.ENTER);
		
	}

	public void enterCity(String city) {
		//String city = ConfigReader.getProperty("city");
		
		WebElement ct=driver.findElement(By.id("react-select-4-input"));
		ct.sendKeys(city);
		ct.sendKeys(Keys.ENTER);
		}

	public void submission() {
		driver.findElement(By.id("submit")).click();
		
	}

}
