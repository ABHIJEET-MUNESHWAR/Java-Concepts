package com.javaconcepts.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 19/02/17
 * Time: 12:45 PM
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread(i + "");
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){
            //
        }
        System.out.println("Finished all threads");
    }
}
