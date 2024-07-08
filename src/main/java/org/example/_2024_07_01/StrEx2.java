package org.example._2024_07_01;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrEx2 {

    public Map<String, Integer> getUniqueStringMap(List<String> list) {
        return list.stream()
                .distinct()
                .map(String::toUpperCase)
                .filter(el -> el.length() < 7)
                .collect(Collectors.toMap(str -> str, String::length));
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Faker().name().firstName());
        }


    }
}
