package org.example._2024_06_05;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public int getSumArr(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public int getSumElofList(List<Integer> list) {
        int sum = 0;
        for (Integer integer: list) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
    }
}