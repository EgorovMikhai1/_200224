package org.example._2024_07_10.fromObjToYAML;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.FileReader;
import java.io.IOException;

public class JacksonYamlDeserializationExample {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            MyObject loadedObject = objectMapper.readValue(new FileReader("output.yaml"), MyObject.class);

            // Теперь loadedObject содержит данные из YAML файла
            System.out.println("Name: " + loadedObject.getName());
            System.out.println("Value: " + loadedObject.getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
