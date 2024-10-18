package org.example._18_10_2024;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {

        OddClass oddClass = new OddClass();
        EvenClass evenClass = new EvenClass();

        Thread oddThread = new Thread(oddClass);
        Thread evenThread = new Thread(evenClass);

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();

        System.out.println(oddClass.oddList);
        System.out.println(evenClass.evenList);









    }
}

class OddClass implements Runnable {

    List<Integer> oddList = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            oddList.add(i);
        }
    }
}

class EvenClass implements Runnable {

    List<Integer> evenList = new ArrayList<Integer>();

    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            evenList.add(i);
        }
    }
}