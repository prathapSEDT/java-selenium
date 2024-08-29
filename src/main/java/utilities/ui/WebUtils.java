package utilities.ui;

import basecomponents.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebUtils {
    public static WebDriver driver;

    public void launchBrowser(){
         driver=new ChromeDriver();
         driver.get(BaseTest.webUrl);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
    }

    public void closeBrowser(){
        driver.close();
    }
    public void killBroser(){
        driver.quit();
    }
}
