package com.javaconcepts.synchronisedhashmap;

import java.util.*;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 19/03/17
 * Time: 6:50 PM
 */
public class SynchronizedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Anjali");
        hashMap.put(2, "Tina");
        hashMap.put(3, "Bhavana");
        Map map = Collections.synchronizedMap(hashMap);
        Set set = map.entrySet();
        synchronized (map) {
            Iterator<Integer> i = set.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        }
    }
}
