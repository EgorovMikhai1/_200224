package org.example._18_10_2024;

import java.util.concurrent.*;

public class CaEx1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            System.out.println("Task start!");
            TimeUnit.SECONDS.sleep(7);

            return "Task done";
        };

        Future<String> future = executorService.submit(task);

        System.out.println("Waiting for result...... ... ..  .      .");

        try {
            String result = future.get();
            System.out.println("RESULT: " + result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}
