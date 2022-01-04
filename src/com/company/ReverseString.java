package com.company;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Dharmendra Kumar Sahu";

        char ch;

        String reverse = "";
        StringBuilder strBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            strBuilder.append(ch);
        }

        System.out.println(strBuilder.toString());
    }


}
