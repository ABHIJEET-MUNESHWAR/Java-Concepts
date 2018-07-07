package com.javaconcepts.thread.deadlock.problem;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 29/01/17
 * Time: 7:15 PM
 */
public class Problem {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: waiting for lock 2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for lock 1...");
            synchronized (Lock1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
