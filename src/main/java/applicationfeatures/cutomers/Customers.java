package applicationfeatures.cutomers;

import basecomponents.BaseTest;
import com.jayway.jsonpath.DocumentContext;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.api.HTTPMethods;

public class Customers extends HTTPMethods{
    SoftAssert softAssert=new SoftAssert();
    public void getAllCustomers(){
        //Request Stimulation
        String resource=BaseTest.resources.read("$.getProducts");
        Response response=processGetRequest(resource,null);
        softAssert.assertEquals(response.getStatusCode(),700,"Get customer api is failed");
        DocumentContext context=convertJsonStringToJsonObject(response.asString());
        String productName=context.read("$.products[0].name").toString();
        softAssert.assertEquals(productName,"Banana");
        System.out.println(context.<Boolean>read("$.products[0].name"));
        System.out.println(context.<Boolean>read("$.products.length()"));
        softAssert.assertAll();
    }
}
