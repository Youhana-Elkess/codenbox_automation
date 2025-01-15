package Pages;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pageBase {
    protected WebDriver driver ;
    public JavascriptExecutor jes;
    public Select select;
    public Actions action;

    //create constructor
    public pageBase (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void scroll()
    {
        jes.executeScript("scrollBy(0,2500)", new Object[0]);
    }
}
