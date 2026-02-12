package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.annotations.AfterClass;

import utils.ConfigReader;

public class BaseClass {

    protected WebDriver driver;

    @BeforeClass
    public void initializeDriver() {

        String browser = ConfigReader.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
        	ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

       
    }

   /* @AfterClass
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}