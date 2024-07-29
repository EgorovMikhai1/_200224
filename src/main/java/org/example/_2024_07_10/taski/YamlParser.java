package org.example._2024_07_10.taski;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class YamlParser {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();

        InputStream inputStream = Yaml.class
                .getClassLoader()
                .getResourceAsStream("1.yaml");

        if(inputStream == null) {
            System.out.println("Cannot find the file");
        }

        Map<String, Object> map = yaml.load(inputStream);
        for (Map.Entry<String, Object> set : map.entrySet()) {
            System.out.println(set.getKey() + " : " + set.getValue());
        }
//        List<Object> list = (List<Object>) map.values();
//
//        System.out.println(list.get(0));
    }
}