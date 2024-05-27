package org.example._2024_05_27;

public class Parent {
    public Child child;

    public void get() {
    }
}

class Child extends Parent {
    public void chM() {

    }

    public static void main(String[] args) {
        new Child().get();
        new Parent().child.chM();
    }
}