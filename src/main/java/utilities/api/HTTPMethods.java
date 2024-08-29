package utilities.api;

import basecomponents.BaseTest;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jsonreader.JsonPath_Reader;

import java.util.Map;

public class HTTPMethods extends JsonPath_Reader {

    public Response processGetRequest(String resources, Map<String,String>parameters){
        RestAssured.baseURI= BaseTest.baseUrl;
        RequestSpecification requestSpecification=null;

        if(parameters!=null){
            for(Map.Entry<String,String> params:parameters.entrySet()){
                requestSpecification=RestAssured.given().param(params.getKey(),params.getValue());
            }
        }else {
            requestSpecification=RestAssured.given();
        }
        Response response=requestSpecification.when()
                .get(resources)
                .then()
                .extract()
                .response();
       return response;
    }
}
