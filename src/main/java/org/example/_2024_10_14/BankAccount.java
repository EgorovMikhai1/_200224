package org.example._2024_10_14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private static double balance;
    private Lock lock = new ReentrantLock();

    public void deposit(double amount) {
        lock.lock();
        balance += amount;
        lock.unlock();
    }

    public void withdraw(double amount) {
        lock.lock();
        //=============
        balance -= amount;
        lock.unlock();
    }
}

class Person {
    BankAccount bankAccount;
}