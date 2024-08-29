package jsonreader;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class JsonPath_Reader {
    DocumentContext context=null;
    public DocumentContext convertJsonStringToJsonObject(String jsonString){
        this.context=JsonPath.parse(jsonString);
        return this.context;
    }


    public DocumentContext getAPIConfigDetails(String fileName){
        File file=new File("src/main/resources/appconfig/"+fileName);
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        }catch(Exception e){
           fileInputStream=null;
           return null;
        }
        if(fileInputStream!=null){
            this.context=JsonPath.parse(fileInputStream);
        }
        return this.context;
    }
}
