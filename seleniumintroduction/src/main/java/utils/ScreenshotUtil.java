package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

	public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File dest = new File("C:\\Users\\Dhiyaan\\OneDrive\\Pictures\\Automation\\" + filename + "_" + timestamp + ".png");
        FileHandler.copy(src, dest);
        //System.out.println("Screenshot saved: " + dest.getAbsolutePath());
    }
	
}
