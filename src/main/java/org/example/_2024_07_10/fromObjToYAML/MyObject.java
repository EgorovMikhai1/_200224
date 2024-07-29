package org.example._2024_07_10.fromObjToYAML;

public class MyObject {
    private String name;
    private int value;

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyObject() {
        // Конструктор по умолчанию (обязателен для десериализации)
    }
}
