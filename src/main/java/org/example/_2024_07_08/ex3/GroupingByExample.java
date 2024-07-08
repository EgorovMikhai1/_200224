package org.example._2024_07_08.ex3;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingByExample {
    public static void main(String[] args) {
        // Пример 1: Группировка списка целых чисел по остатку от деления на 3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> groups = numbers.stream()
                .collect(Collectors.partitioningBy(el -> el %2 == 0));

        /**
         * Map<Integer, List<Integer>> groups = numbers.stream()
         *                 .collect(Collectors.groupingBy(set()));
         *
         * boolean set(int el) {
         *  return el % 2 == 0;
         * }
         *
         */



        System.out.println(groups);

        // Пример 2: Группировка списка строк по их длине
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> lengthGroups = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(lengthGroups);
        
        // Пример 3: Группировка списка объектов по их свойству "тип"
        class Person {
            private String name;
            @Getter
            private String type;

            public Person(String name, String type) {
                this.name = name;
                this.type = type;
            }

        }

        List<Person> people = Arrays.asList(
                new Person("John", "student"),
                new Person("Jane", "teacher"),
                new Person("Tom", "student"),
                new Person("Emily", "teacher")
        );

        Map<String, List<Person>> typeGroups = people.stream()
                .collect(Collectors.groupingBy(Person::getType));
        System.out.println(typeGroups);
    }
}