package pageactions;

import org.openqa.selenium.support.PageFactory;
import pageobjects.Login_OR;
import utilities.ui.WebUtils;

public class LoginPage extends WebUtils {
private Login_OR loginOr= PageFactory.initElements(driver,Login_OR.class);

public void login(){
    loginOr.userName.sendKeys("Admin");
    loginOr.passWord.sendKeys("admin123");
    loginOr.loginButton.click();
}


}
