package org.example._2024_10_16;

public class DeadLock {
    public static final Object LOCK_A = new Object();
    public static final Object LOCK_B = new Object();


}

class ThreadA extends Thread {
    @Override
    public void run() {
        synchronized (DeadLock.LOCK_A) {
            System.out.println("ThreadA");

        }
    }
}

class ThreadB extends Thread {

    @Override
    public void run() {
        synchronized (DeadLock.LOCK_B) {
            System.out.println("ThreadB");
        }
    }
}