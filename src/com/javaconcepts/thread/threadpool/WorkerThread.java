package com.javaconcepts.thread.threadpool;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 19/02/17
 * Time: 12:41 PM
 */
public class WorkerThread implements Runnable {
    String message;

    WorkerThread(String msg) {
        message = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processThread();
        System.out.println(Thread.currentThread().getName() + " (end)");
    }

    private void processThread() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
