package com.javaconcepts.hashmap;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 23/02/17
 * Time: 9:48 PM
 */
public class HashMapCustom<K, V> {
    private Entry<K, V>[] table;
    private int capacity = 4;

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public HashMapCustom() {
        table = new Entry[capacity];
    }

    public void put(K key, V data) {
        if (key == null) {
            return;
        }
        int hash = hash(key);
        Entry<K, V> node = new Entry<K, V>(key, data, null);
        if (table[hash] == null) {
            table[hash] = node;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        node.next = current.next;
                        table[hash] = node;
                        return;
                    } else {
                        node.next = current.next;
                        previous.next = node;
                        return;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = node;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
            return null;
        }
    }

    public boolean remove(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return false;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        table[hash] = current.next;
                    } else {
                        previous.next = current.next;
                    }
                    return true;
                }
                previous = current;
                current = current.next;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> entry = table[i];
                if (entry != null) {
                    System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
                }
                entry = entry.next;
            }
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }
}
