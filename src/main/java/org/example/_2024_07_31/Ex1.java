package org.example._2024_07_31;

import java.util.ArrayList;
import java.util.Collection;

public class Ex1 {
    public static void main(String[] args) {

        String s = "";

        for (int i = 0; i < 10; i++) {
            s = s + i;
        }

        Ex2.go(new ArrayList<Integer>());
        Ex2.go(new ArrayList<String>());
    }
}

class Ex2<T> {

    public void getPair(int[] sortedArr, int k) {

    }


    public T get() {
        return null;
    }

    static <W> W go(Collection<? extends W> c) {
        return c.iterator().next();
    }
}