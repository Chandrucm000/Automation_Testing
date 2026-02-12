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
		
	/*public static String takeFullPageScreenshot(WebDriver driver, String testName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String filePath = System.getProperty("user.dir")
                + "/screenshots/" + testName + "_" + timestamp + ".png";

        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Page.enable());

        String base64Image = devTools.send(
            Page.captureScreenshot(
                Optional.of(Page.CaptureScreenshotFormat.PNG),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.of(true),
                Optional.of(false)
            )
        );

        try {
            byte[] imageBytes =
                    java.util.Base64.getDecoder().decode(base64Image);
            FileUtils.writeByteArrayToFile(new File(filePath), imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;
    }*/
	}
	
}
