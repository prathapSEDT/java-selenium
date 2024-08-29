package basecomponents;

import com.jayway.jsonpath.DocumentContext;
import jsonreader.JsonPath_Reader;

public abstract  class BaseTest {

    public static String baseUrl;
    public static String environment;
    public static DocumentContext resources;
    public static String webUrl;


    public static void getConfigDetails(){
        JsonPath_Reader jsonPath_reader=new JsonPath_Reader();
        //Configuration Details
        DocumentContext config=jsonPath_reader.getAPIConfigDetails("api/appconfig.json");
        environment=config.read("$.env").toString();
        baseUrl=config.read("$."+environment+".baseurl").toString();
        webUrl=config.read("$."+environment+".weburl").toString();
    }
    public static void getAPIResources()
    {
        JsonPath_Reader jsonPath_reader=new JsonPath_Reader();
        resources=jsonPath_reader.getAPIConfigDetails("resources/resources.json");
    }
}
