package com.javaconcepts.hashmapexperiments;

import java.util.HashMap;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 25/03/17
 * Time: 8:35 PM
 */
public class SameKey {

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(100, 1);
        hashMap.put(100, 2);
        hashMap.put(100, 3);
        System.out.println(hashMap);
    }
}
