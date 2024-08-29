package restassured;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PostCall {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src/main/resources/input/empdata.json");
        FileInputStream fileInputStream=new FileInputStream(file);
        DocumentContext jsonPath= JsonPath.parse(fileInputStream);

        RestAssured.baseURI = "https://reqres.in";
        Response response=RestAssured
                .given()
                .body(jsonPath.jsonString())
                .when()
                .post("/api/users")
                .then()
                .extract()
                .response();
        System.out.println(response.asPrettyString());
    }
}
