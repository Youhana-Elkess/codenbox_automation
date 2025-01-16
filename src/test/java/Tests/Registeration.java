package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;

import org.openqa.selenium.By;

import Pages.userRegister;

public class Registeration extends testBase {
    private static final Logger logger = LogManager.getLogger(Registeration.class);
    userRegister userRegisterObject;

    @Test 
    public void userRegisterTest() throws InterruptedException
    {
        logger.info("Starting user registration test.");
        userRegisterObject = new userRegister(driver);
        userRegisterObject.Register("Youhana", "Refat", "Test@gmail.com", "0123456789");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nf-form-3-cont\"]/div/div[1]"))); 
        
        logger.info("Checking registration message.");
        userRegisterObject.assertRegistrationMessage();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"post-2\"]/div/h2"))); 
        
        logger.info("Checking welcome message.");
        userRegisterObject.assertWelcomeMessage();
        
        logger.info("User registration test completed.");
    }

}
