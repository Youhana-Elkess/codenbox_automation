import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helpers {

    public static void CaptureScreenShot(WebDriver driver, string screenshotName)
    {
        Path dest = Paths.get("./Screenshots", screenshotName+".png");
        Files.createDirectories(dest.getParent());
        FileOutputStream out = new FileOutputStream(dest.toString());
        out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
        out.close();
        System.out.println("Exeption while taking screenshot"+ e.getMessage());
    }

}
