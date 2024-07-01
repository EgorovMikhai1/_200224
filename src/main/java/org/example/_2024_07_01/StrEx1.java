package org.example._2024_07_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrEx1 {
    public static String cut(String str) {
        //!!!!
        return str + " ! ";
    }



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 3, 65, 47, 89, 65, 4, 1, 23);

        // list.stream() итд


        Stream.of(2, 3, 65, 47, 89, 65, 4, 1, 23);

//        list.stream()
//                .filter(el -> el > 50)
//                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("m ama", "myla", "ramu");

        list1.stream()
                .map(el -> {
                    return el + " ! ";
                } )//----->
                .forEach(System.out::println);
    }


}
