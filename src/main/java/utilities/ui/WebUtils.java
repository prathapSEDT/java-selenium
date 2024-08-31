package utilities.ui;

import basecomponents.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class WebUtils {
    public static WebDriver driver;

    public void launchBrowser(){
         driver=new ChromeDriver();
         driver.get(BaseTest.webUrl);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }

    public boolean checkElementExist(WebElement element, String elementName){
        try{
            if(element.isDisplayed()){
                System.out.println(elementName+" is displayed");
                return true;
            }else {
                System.out.println(elementName+" is not displayed");
                return false;
            }
        }catch (Exception e){
            System.out.println(elementName+" is not displayed");
            return false;
        }
    }

    public void takeScreenShot(){
        TakesScreenshot sht=(TakesScreenshot) driver;
        File src= sht.getScreenshotAs(OutputType.FILE);
        File dest=new File("screenshots/screenpage.png");
        try{
            FileUtils.copyFile(src,dest);
        }catch (Exception e){
            System.out.println("Failed to take screenshot of the page");
        }

    }

    public void clickElement(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).click(element).build().perform();
    }
    public void fillData(WebElement element,String data){
        element.click();
        element.clear();
        element.sendKeys(data);
    }


    public void closeBrowser(){
        driver.close();
    }
    public void killBroser(){
        driver.quit();
    }

    public void refreshCurrentPage(){
        driver.navigate().refresh();
    }
    public void goBack(){
        driver.navigate().back();

    }
    public void moveFarward(){
        driver.navigate().forward();
    }
}
