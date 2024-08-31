package pageactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Admin_OR;
import utilities.ui.WebUtils;

public class AdminPage extends WebUtils {
    Admin_OR adminOr= PageFactory.initElements(driver,Admin_OR.class);

    public  void navigateToAdminPage(){
        clickElement(adminOr.adminTab);
    }

    public void checkRefPrevFar(){
        refreshCurrentPage();
        goBack();
        moveFarward();
    }
}
