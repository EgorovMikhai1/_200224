package org.example._2024_06_12;

import java.util.*;

public class Topic {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        for (String s : stringList) {
            System.out.println(s);
        }

        Map<Integer, String> phoneDic = new HashMap<>();

        phoneDic.put(123, "Q");
        phoneDic.put(456, "A");
        phoneDic.put(789, "S");
        phoneDic.put(890, "R");
        phoneDic.put(123, "QQQ");
        phoneDic.put(null, null);

        for (Map.Entry<Integer, String> entry : phoneDic.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

//        System.out.println(phoneDic);
    }
}
