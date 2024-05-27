package org.example._2024_05_27;

public class Template {

    public void get(Mok mok) {
        System.out.println(mok);
    }
}

class Mok {

}

class PersonMok extends Mok {

}

class Main {
    public static void main(String[] args) {
        Template template = new Template();
        PersonMok personMok = new PersonMok();

        Mok mok = new Mok();

        template.get(personMok);
    }
}