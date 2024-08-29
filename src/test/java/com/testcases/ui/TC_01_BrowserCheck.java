package com.testcases.ui;

import annotations.Annotations;
import org.testng.annotations.Test;
import pageactions.LoginPage;
import utilities.ui.WebUtils;

public class TC_01_BrowserCheck extends Annotations {
    @Test
    public void checkBrowserTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }
}
