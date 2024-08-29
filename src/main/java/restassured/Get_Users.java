package restassured;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import genericexception.CustomException;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

public class Get_Users {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";
        Response response = RestAssured
                .given()
                .queryParam("page", 2)
                .when()
                .get("/api/users")
                .then()
                .extract()
                .response();
        int responseCode=response.statusCode();
       if(responseCode!=200){
           throw new CustomException("Get Users call is failed");
       }
        DocumentContext documentContext= JsonPath.parse(response.body().asString());
       List<String> data=documentContext.read("$.data") ;
        for(int i=0;i<=data.size()-1;i++){
            System.out.println(String.valueOf(documentContext.read("$.data["+i+"].first_name")));
        }

    }
}
