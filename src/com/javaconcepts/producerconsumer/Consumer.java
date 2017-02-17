package com.javaconcepts.producerconsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 14/02/17
 * Time: 12:05 PM
 */
public class Consumer implements Runnable{
    private BlockingQueue<Message> queue;

    Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            while(!"exit".equals(queue.take().getMsg())){
                Thread.sleep(10);
                System.out.println("Consumed: " + queue.take().getMsg());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
