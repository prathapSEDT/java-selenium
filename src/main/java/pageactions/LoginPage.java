package pageactions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.Login_OR;
import utilities.ui.WebUtils;

public class LoginPage extends WebUtils {
private Login_OR loginOr= PageFactory.initElements(driver,Login_OR.class);

public void login(){
    loginOr.userName.sendKeys("Admin");
    loginOr.passWord.sendKeys("admin123");
    loginOr.loginButton.click();
}
public void validateLoginPage(){
   boolean status= checkElementExist(loginOr.userName,"User Name");
    Assert.assertEquals(status,true,"Login Page Validation failed");
    takeScreenShot();
}
public  void validateLoginPageTitle(){
    String  pageTitle=getPageTitle();
    Assert.assertEquals(pageTitle,"OrangeHRM","Login Page title validation Failed");

}



}
