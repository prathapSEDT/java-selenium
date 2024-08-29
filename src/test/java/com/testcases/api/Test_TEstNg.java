package com.testcases.api;

import annotations.Annotations;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_TEstNg extends Annotations {
    @Test(priority = 3,dependsOnMethods = {"bRegisterUser"})
    public void aLogout(){
        System.out.println("Logging out");
    }
    @Test(priority = 1)
    public void cLogin(){
        System.out.println("Logging inn");
        Assert.assertEquals(true,false);
    }
    @Test(priority =2,dependsOnMethods = {"cLogin"})
    public void bRegisterUser(){
        System.out.println("Register a user");
    }


}
