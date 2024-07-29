package org.example._2024_07_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReEx2 {
    public List<String> getCommonChars(String[] arr) {
        List<String> commonChars = new ArrayList<>();
        int[] freq = new int[26];

        Arrays.fill(freq, Integer.MAX_VALUE);

        for (String currentEl : arr) {
            int[] freqIn = new int[26];

            for (char c : currentEl.toCharArray()) {
                freqIn[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                freq[i] = Math.min(freq[i], freqIn[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {

            }
        }

        return null;
    }

    public static void main(String[] args) {

//        char s = 'd';
//        int sd = 44 + s;
    }
}
