package org.example._2024_06_17;

public class Jewelery {

    public int getNumOfj(String j, String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(j.indexOf(s.charAt(i)) > -1) {
                count +=1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String jS = "aIb";
        String set = "jHaaivyIilkfIgtB";

        System.out.println(new Jewelery().getNumOfj(jS, set));
    }
}