package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class userRegister extends pageBase{

        public userRegister(WebDriver driver) {
            super(driver);
            action = new Actions(driver);
        }
    
        @FindBy(id = "nf-field-17")
        WebElement FirstName;
    
        @FindBy(id = "nf-field-18")
        WebElement LastName;
    
        @FindBy(id = "nf-field-19")
        WebElement Email;
    
        @FindBy(id = "nf-field-20")
        WebElement PhoneNumber;
    
        @FindBy(id = "nf-field-22")
        WebElement SelectCourse;
    
        @FindBy(xpath = "//*[@id=\"nf-field-22\"]/option[2]")
        WebElement Course;
    
        @FindBy(id = "nf-field-24")
        WebElement SelectMonth;
    
        @FindBy(xpath = "//*[@id=\"nf-field-24\"]/option[5]")
        WebElement Month;
    
        @FindBy(xpath = "//*[@id=\"nf-label-class-field-23-1\"]")
        WebElement HowDoYouKnow;
    
        @FindBy(id = "nf-field-15")
        WebElement Register;
    
        @FindBy(xpath  = "//*[@id=\"nf-form-3-cont\"]/div/div[1]")
        WebElement completionMessage;

        @FindBy(linkText = "Home")
        WebElement homeButton;

        @FindBy(xpath = "//*[@id=\"post-2\"]/div/h2")
        WebElement welcomeMessage;
    
        public void Register(String firstName, String lastName, String email, String phoneNumber) {
            FirstName.sendKeys(firstName);
            LastName.sendKeys(lastName);
            Email.sendKeys(email);
            PhoneNumber.sendKeys(phoneNumber);
            SelectCourse.click();
            Course.click();
            SelectCourse.click();
            SelectMonth.click();
            Month.click();
            SelectMonth.click();
            HowDoYouKnow.click();
            Register.click();
            
        }

        public void assertRegistrationMessage()
        {
            Assert.assertTrue(completionMessage.isDisplayed(), "Completion message is not displayed.");
            homeButton.click();
        }

        public void assertWelcomeMessage()
        {
            Assert.assertTrue(welcomeMessage.isDisplayed(),"Welcome message is not displayed");
        }

    
}


