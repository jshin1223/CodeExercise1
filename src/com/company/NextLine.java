package com.company;

public class NextLine {

    public static void main(String[] args) {

        String str = "Dharmendra Kumar Sahu";
        char ch;
        String eachLine = "";

//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//
//            if (ch == ' ') {
//                System.out.println(eachLine);
//                eachLine = "";
//            } else {
//                eachLine = eachLine + ch;
//            }
//        }
//        System.out.println(eachLine);

        print(str);
    }


    public static void print(String str) {
        if (str != null) {
            String[] stringArray = str.split(" ");
            for (String temp : stringArray){
                System.out.println(temp);
            }
        }
    }
}
