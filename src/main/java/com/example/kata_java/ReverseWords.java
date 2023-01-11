package com.example.kata_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String str){
        String newStr = "";
        String[] strSplitted = str.split(" ", 0);

        for (int i=strSplitted.length-1; i >= 0 ; i--) {
            String word = strSplitted[i];
            newStr += word + " ";
        }
        return newStr.substring(0, newStr.length() - 1);
    }

    public static String goodPracticeReverseWords(String str) {
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }
}
