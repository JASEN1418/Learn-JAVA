package com.JASEN1418.MyThread;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueFoodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public ArrayBlockingQueueFoodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                String take = queue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
