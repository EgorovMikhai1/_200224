package org.example._2024_05_27;

public interface FlyAble {
}

class Mainss {
    public void fun1(FlyAble flyAble) {
    }

    public static void main(String[] args) {
        new Mainss().fun1(new Exa());
    }
}

class Exa implements FlyAble {

}

