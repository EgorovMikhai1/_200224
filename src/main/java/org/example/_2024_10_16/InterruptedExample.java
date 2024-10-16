package org.example._2024_10_16;

public class InterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");

        Task task = new Task();
        task.start();

        Thread.sleep(4444);

        task.interrupt();

        System.out.println("MAIN END");
    }
}

class Task extends Thread {
    long count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (isInterrupted()) {
                System.out.println("Interrupted");
                return;
            }

            System.out.println("I:" + i);

        }
    }
}