package com.testcases.api;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_02_TestDataSetup {
    @DataProvider(name = "credentials")
    public Object[][] loginData(){
        Object[][] arr=new Object[3][2];
        //1st row
        arr[0][0]="User_01";
        arr[0][1]="Pass123";

        //2nd row
        arr[1][0]="User_02";
        arr[1][1]="Pass123";

        //3rd row
        arr[2][0]="User_03";
        arr[2][1]="Pass123";

        return arr;
    }




    @Test(dataProvider = "credentials",groups = {"smoke"})
    public void doLogin(String userName,String password){
        System.out.println(userName+"--"+password);
    }
}
