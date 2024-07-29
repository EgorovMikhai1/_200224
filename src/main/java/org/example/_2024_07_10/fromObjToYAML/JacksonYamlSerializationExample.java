package org.example._2024_07_10.fromObjToYAML;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.FileWriter;
import java.io.IOException;

public class JacksonYamlSerializationExample {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.setName("Example Name");
        myObject.setValue(42);

        try {
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            FileWriter writer = new FileWriter("output.yaml");
            objectMapper.writeValue(writer, myObject);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
