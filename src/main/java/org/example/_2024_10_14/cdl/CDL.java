package org.example._2024_10_14.cdl;

import java.util.concurrent.CountDownLatch;

public class CDL {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void setUp1() throws InterruptedException {
        Thread.sleep(2222);
        System.out.println("SET UP 1--------");
        countDownLatch.countDown();
        System.out.println("CDL count: " + countDownLatch.getCount());
    }

    private static void setUp2() throws InterruptedException {
        Thread.sleep(2345);
        System.out.println("SET UP 2--------");
        countDownLatch.countDown();
        System.out.println("CDL count: " + countDownLatch.getCount());
    }

    private static void setUp3() throws InterruptedException {
        Thread.sleep(2355);
        System.out.println("SET UP 3--------");
        countDownLatch.countDown();
        System.out.println("CDL count: " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Item("Q", countDownLatch);
        new Item("WWQ", countDownLatch);
        new Item("QRR", countDownLatch);

        setUp1();
        setUp2();
        setUp3();

    }
}

class Item extends Thread {

    String itemName;
    private CountDownLatch countDownLatch;

    public Item(String itemName, CountDownLatch countDownLatch) {
        this.itemName = itemName;
        this.countDownLatch = countDownLatch;
        this.start();
        System.out.println(this.getName());
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println("Item execute: " + itemName);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}