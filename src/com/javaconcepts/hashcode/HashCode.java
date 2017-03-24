package com.javaconcepts.hashcode;

import java.util.HashSet;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 24/03/17
 * Time: 10:11 PM
 */
public class HashCode {
    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet.size());
    }
}
