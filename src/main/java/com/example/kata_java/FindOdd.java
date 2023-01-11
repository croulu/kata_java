package com.example.kata_java;

import java.util.HashMap;
import java.util.Set;

public class FindOdd {
    public static int findIt(int[] a) {

        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for (int j = 0; j < a.length; j++) {
            hashmap.put(a[j], j);
        }

        Set<Integer> distinctValues = hashmap.keySet();

        System.out.println(distinctValues);

        return 1;
    }
}
