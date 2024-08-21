package org.example._2024_08_05;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@ToString
@AllArgsConstructor
public class Personn {

    private int id;
    private String name;
    private Personn personn;

    private static Personn getFamous(Personn[] famous) {
        Personn famousCanidate = null;

        int first = 0;
        int last = famous.length - 1;

        while (first != last) {
            if (famous[first].knows(famous[last])) {
                first++;
            } else {
                last--;
            }
        }

        for (int i = 0; i < famous.length; i++) {
            if (i != first && (famous[i].knows(famous[first]) || famous[first].knows(famous[i]))) {
                famousCanidate = null;
            } else {
                famousCanidate = famous[first];
            }
        }

        return famousCanidate;
    }

    //todo
    private boolean knows(Personn famous) {

        return this.personn.id == famous.id;
    }

    public static void main(String[] args) {
        Personn fam = new Personn(999, "FAM", null);
        Personn p1 = new Personn(1, "Person 1", fam);
        Personn p2 = new Personn(2, "Person 2", fam);
        Personn p3 = new Personn(3, "Person 3", fam);
        Personn p4 = new Personn(4, "Person 4", fam);
        Personn p5 = new Personn(5, "Person 1", fam);

        Personn[] arr = {p3, p1, p2, fam, p4, p5};


//        System.out.println(Arrays.toString(arr));
        Personn p = getFamous(arr);

        if (p != null) {
            System.out.println("NAME: " + p.name);
        } else {
            System.out.println("NULL");
        }
    }
}