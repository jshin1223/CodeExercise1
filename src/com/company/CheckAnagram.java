package com.company;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dcba";

        if(str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println("They are anagram.");
            } else {
                System.out.println("They are not anagram.");
            }

        } else {
            System.out.println("They are not anagram.");
        }
    }
}
