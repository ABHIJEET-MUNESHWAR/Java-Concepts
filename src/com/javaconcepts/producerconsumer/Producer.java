package com.javaconcepts.producerconsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 14/02/17
 * Time: 12:02 PM
 */
public class Producer implements Runnable {
    private BlockingQueue<Message> queue;

    Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Message msg = new Message("" + i);
            try {
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("Produced: " + msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Message msg = new Message("Exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
