package com.javaconcepts.implementrunnable;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 29/01/17
 * Time: 4:15 PM
 * https://www.tutorialspoint.com/java/java_multithreading.htm
 */

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("Creating thread: " + name);
    }

    public void start() {
        System.out.println("Starting thread: " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public void run() {
        System.out.println("Running thread: " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + threadName + ": " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " interrupted");
        }
        System.out.println("Exiting thread: " + threadName);
    }
}

public class ImplementRunnable {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread 1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("Thread 2");
        r2.start();
    }
}
