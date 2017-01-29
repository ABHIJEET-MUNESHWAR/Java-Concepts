package com.javaconcepts.thread.synchronization.nosync;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 29/01/17
 * Time: 5:18 PM
 */
class PrintDemo {
    public void printCount() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Counter: " + i);
            }
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo pd;

    ThreadDemo(String name, PrintDemo pd) {
        this.threadName = name;
        this.pd = pd;
        System.out.println("Creating thread: " + threadName);
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
        pd.printCount();
        System.out.println("Exiting thread: " + threadName);
    }
}

public class ThreadNoSync {
    public static void main(String[] args) {
        PrintDemo pd = new PrintDemo();
        ThreadDemo t1 = new ThreadDemo("Thread 1", pd);
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Thread 2", pd);
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch(Exception e) {
            System.out.println("Interrupted");
        }
    }
}
