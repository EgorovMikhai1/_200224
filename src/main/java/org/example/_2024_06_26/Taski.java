package org.example._2024_06_26;

public class Taski {

    public int getLongestSubStr(String str) {
        int count = 0;
        int[] holder = new int[256];

        for (int i = 0, j = 0; j < str.length(); j++) {
            i = Math.max(i, holder[str.charAt(j)]);
            count = Math.max(count, j - i + 1);
            holder[str.charAt(j)] = j + 1;
        }
        return count;
    }

    //NINA VERSION
    public static int sizeOfSubstring(String s){
        StringBuilder subStr = new StringBuilder();
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!subStr.toString().contains(Character.toString(s.charAt(i)))) {
                subStr.append(s.charAt(i));
            } else {
                if (subStr.length()>size){
                    size = subStr.length();
                }
                subStr = new StringBuilder("" + s.charAt(i));
            }
        }
        return Math.max(subStr.length(), size);
    }


    public static void main(String[] args) {
        String s = "abcdeafuklmnabcd";
        System.out.println(new Taski().getLongestSubStr(s));
    }
}
