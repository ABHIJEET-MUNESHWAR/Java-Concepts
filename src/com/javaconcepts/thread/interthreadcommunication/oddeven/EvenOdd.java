package com.javaconcepts.thread.interthreadcommunication.oddeven;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 29/01/17
 * Time: 6:25 PM
 */
class Numbers {
    boolean flag = false;

    public synchronized void odd(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(n);
        flag = true;
        notify();
    }

    public synchronized void even(int n) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(n);
        flag = false;
        notify();
    }
}

class Thread1 implements Runnable {
    private Thread t;
    Numbers numbers;
    private int[] odd = {1, 3, 5, 7, 9};

    Thread1(Numbers numbers) {
        this.numbers = numbers;
        t = new Thread(this, "Odd");
        t.start();
    }

    public void run() {
        for (int i = 0; i < odd.length; i++) {
            numbers.odd(odd[i]);
        }
    }
}

class Thread2 implements Runnable {
    private Thread t;
    Numbers numbers;
    private int[] even = {2, 4, 6, 8, 10};

    Thread2(Numbers numbers) {
        this.numbers = numbers;
        t = new Thread(this, "Odd");
        t.start();
    }

    public void run() {
        for (int i = 0; i < even.length; i++) {
            numbers.even(even[i]);
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        new Thread1(numbers);
        new Thread2(numbers);
    }
}
