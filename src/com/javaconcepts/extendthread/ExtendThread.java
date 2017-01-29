package com.javaconcepts.extendthread;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 29/01/17
 * Time: 4:44 PM
 */
class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
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
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread: " + threadName);
        }
        System.out.println("Exiting thread: " + threadName);
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        ThreadDemo d1 = new ThreadDemo("Thread 1");
        d1.start();
        ThreadDemo d2 = new ThreadDemo("Thread 2");
        d2.start();
    }
}
