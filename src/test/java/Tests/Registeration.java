package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;

import Pages.userRegister;

public class Registeration extends testBase {
    userRegister userRegisterObject;

    @Test 
    public void userRegisterTest() throws InterruptedException
    {
        userRegisterObject = new userRegister(driver);
        userRegisterObject.Register("Youhana", "Refat", "Test@gmail.com", "0123456789");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nf-form-3-cont\"]/div/div[1]"))); 
        
        userRegisterObject.assertRegistrationMessage();
        
        Thread.sleep(100);

        userRegisterObject.assertWelcomeMessage();
    }

}
