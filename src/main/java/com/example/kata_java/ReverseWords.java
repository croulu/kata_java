package com.example.kata_java;

public class ReverseWords {
    public static String reverseWords(String str){
        String newStr = "";
        String[] strSplitted = str.split(" ", 0);
        for (String word : strSplitted) {
            newStr += word + " ";
        }
        return newStr.substring(0, newStr.length() - 1);
    }
}
