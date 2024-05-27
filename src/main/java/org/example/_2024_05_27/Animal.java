package org.example._2024_05_27;

public class Animal {
    public void animalFUN() {

    }

    public void funX() {
        System.out.println("Animal exists");
    }
}

class WildAnimal extends Animal {

}

class HomeAnimal extends Animal {
}

class Cat extends HomeAnimal {
}

class Wolf extends WildAnimal {

    public Wolf() {
    }

    @Override
    public void funX() {
        System.out.println("Wolf exists");
    }
}

class Mains {
    public void getAnimal(Animal animal) {

    }

    public static void main(String[] args) {
        Animal animal = new Wolf();
        animal.funX();

        Wolf wolf = new Wolf();
//        new Mains().getAnimal(new Wolf());
//
//        Animal animal = new Wolf();
//
////        Wolf wolf = new Animal();
//
//        Animal a1 = new Wolf();
//        a1.animalFUN();
//
//        Animal animal1 = new Animal();
//        animal1.
    }
}