package com.testcases.ui;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TC_02_CheckDragDrop {
    @Test
    public void validateDragDrop() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        WebElement src=driver.findElement(By.cssSelector("#draggable"));
        WebElement dest=driver.findElement(By.cssSelector("#droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(src,dest).build().perform();
Thread.sleep(3000);
        //page scroll
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
        js.executeScript("scroll(0,250)");


    }
}
