//package org.example._2024_05_22;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//
//@Getter
//@AllArgsConstructor
//public class Person {
//    private String name;
//    private Birthday birthday;
//}
//
//@AllArgsConstructor
//class Birthday {
//    private int day;
//    private int month;
//    private int year;
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//}
//
//class Shop {
//
//    public static boolean isAlcoSellingPerm(Person person) {
//       if(person.getBirthday().getYear() < 2006) {
//           return false;
//       }
//       return true;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        boolean alc = Shop.isAlcoSellingPerm(new Person("S", null));
//    }
//}