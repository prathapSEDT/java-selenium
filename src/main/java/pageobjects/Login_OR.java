package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_OR {
    @FindBy(xpath="//input[@name='username']")
    public WebElement userName;
    @FindBy(xpath="//input[@name='password']")
    public WebElement passWord;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;
}
