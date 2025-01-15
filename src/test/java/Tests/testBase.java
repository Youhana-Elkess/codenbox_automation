package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import utilities.Helpers;

public class testBase {

    public static WebDriver driver;
    private String url;
    
    @BeforeSuite
    public void setDriver() throws Exception {
        // Load properties from config file
        Properties properties = new Properties();
        
        // Use getResourceAsStream to load the properties file from the classpath
        InputStream input = getClass().getClassLoader().getResourceAsStream("Tests/config.properties");
        
        if (input == null) {
            throw new FileNotFoundException("Property file not found in the classpath");
        }
        
        properties.load(input);
        
        // Get the URL from properties
        url = properties.getProperty("url");

        driver = new ChromeDriver();
        WebDriverManager.chromiumdriver().setup();
        driver.manage().window().maximize();
        driver.navigate().to(url); // Use the URL from properties
    }
    
    @AfterSuite(enabled = true)
    public void stopDriver() {
        driver.quit();
    }
    
    @AfterMethod
    public void ScreenshotOnfailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking screenshot");
            Helpers.CaptureScreenShot(driver, result.getName());
            
        }
    }
}
