package org.example._2024_10_14;

public class Shop {
    private int itemCount = 0;

    public synchronized void getItem() throws InterruptedException {
        while (itemCount < 0) {
            wait();
        }
        itemCount--;
        System.out.println("GET ITEM");
    }

    public synchronized void putItem() throws InterruptedException {
        while (itemCount >= 5) {
            wait();
        }
        itemCount++;
        System.out.println("PUT ITEM");
        notify();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);

        Thread pT = new Thread(producer);
        Thread cT = new Thread(consumer);

        pT.start();
        cT.start();
    }
}

class Producer implements Runnable {
    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                shop.putItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                shop.getItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}