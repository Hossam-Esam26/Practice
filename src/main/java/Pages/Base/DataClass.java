package Pages.Base;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class DataClass {

    static String jsonPath = "src/test/resources/TestData/data.Json";

    public static String jsonData(String objectName , String dataFromJson) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(jsonPath));
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject ValidUser = (JSONObject) jsonObject.get(objectName);
        String data = (String) ValidUser.get(dataFromJson);


        return data;
    }
}
