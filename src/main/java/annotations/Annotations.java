package annotations;

import basecomponents.BaseTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.ui.WebUtils;

public class Annotations {
    @BeforeSuite
    public void beforeSuite(){
        BaseTest.getConfigDetails();
        BaseTest.getAPIResources();

        WebUtils utils=new WebUtils();
        utils.launchBrowser();

    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Logic for after suite");
    }
}
