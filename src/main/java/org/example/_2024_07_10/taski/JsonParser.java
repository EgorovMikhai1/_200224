package org.example._2024_07_10.taski;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

//todo
public class JsonParser {

    String str;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = JsonParser.class.getResourceAsStream("/ex.json");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();

        String line;

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }

        JSONObject json = new JSONObject(stringBuilder);

        Map<String, Object> map = json.toMap();

        for (Map.Entry<String, Object> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
