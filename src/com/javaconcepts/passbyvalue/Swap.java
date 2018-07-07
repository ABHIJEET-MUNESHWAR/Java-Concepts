package com.javaconcepts.passbyvalue;

import java.util.ArrayList;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/03/17
 * Time: 10:04 AM
 */
public class Swap {

    private static void swap(ArrayList<Integer> list) {
        Integer t = list.get(0);
        list.set(0, list.get(1));
        list.set(1, t);
    }

    private static void swap(Integer i1, Integer i2) {
        Integer t = i1;
        i1 = i2;
        i2 = t;
    }

    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        Swap.swap(i1, i2);
        Swap.swap(list);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
