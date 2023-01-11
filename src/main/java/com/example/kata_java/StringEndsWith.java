package com.example.kata_java;

public class StringEndsWith {

    public static boolean stringEndsWith(String str, String ending) {
        int posEndingInStr = str.lastIndexOf(ending);
        if (posEndingInStr == -1) {
            return false;
        } else {
            return posEndingInStr == str.length() - ending.length() ? true : false;
        }
    }
}
