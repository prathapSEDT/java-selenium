package com.testcases.api;

import annotations.Annotations;
import applicationfeatures.cutomers.Customers;
import com.jayway.jsonpath.DocumentContext;
import org.testng.annotations.Test;
import utilities.api.HTTPMethods;

public class TC_01_GetCustomers extends Annotations {
    @Test(groups = {"regression"})
    public void getCustomers(){
        Customers customers=new Customers();
        customers.getAllCustomers();
    }
}
