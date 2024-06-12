package org.example._2024_05_29;

import java.util.List;

public class Hero {
    int id;
    String name;
}

class Elf extends Hero {

}

class Ogr extends Hero {

}

class Tre extends Hero implements FlyAble {

    @Override
    public void fly() {

    }
}

interface FlyAble {
    void fly();
}

class Main {
    public void getHero(Hero hero) {

    }

    public void getFly(FlyAble flyAble) {

    }

    public static void main(String[] args) {

    }
}
