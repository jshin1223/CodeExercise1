package com.company;

public class DuplicateCharacter {

    public static void main(String[] args) {

        String str = "abcddde";

        char duplicateChar = firstDuplicateCharacter(str);

        if (duplicateChar != 0) {
            System.out.println(duplicateChar + " is first duplicate character.");
        } else {
            System.out.println("No duplicate character.");
        }
    }

    public static char firstDuplicateCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    return ch1;
                }
            }
        }
        return 0;
    }
}
