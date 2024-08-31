package com.testcases.ui;

import annotations.Annotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pageactions.AdminPage;
import pageactions.LoginPage;
import utilities.ui.WebUtils;

public class TC_01_BrowserCheck extends Annotations {
    private static final Logger log = LoggerFactory.getLogger(TC_01_BrowserCheck.class);

    @Test
    public void checkBrowserTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.validateLoginPage();
        loginPage.login();
        loginPage.validateLoginPageTitle();

//        AdminPage adminPage=new AdminPage();
//        adminPage.navigateToAdminPage();
//        adminPage.checkRefPrevFar();
    }
}
