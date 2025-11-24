
public class launchBrowser {

	public static void main(String[] args) {
		
		// Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to a site
        driver.get("https://www.google.com");

        // Print page title
        System.out.println("Page Title is: " + driver.getTitle());

        // Close browser
        //driver.quit();

	}

}
