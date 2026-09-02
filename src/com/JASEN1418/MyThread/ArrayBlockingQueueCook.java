package com.JASEN1418.MyThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ArrayBlockingQueueCook extends Thread{

    public ArrayBlockingQueue<String> queue;
    //LinkedBlockingQueue 不限制长度的阻塞队列 底层是链表

    public ArrayBlockingQueueCook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                queue.put("面条！");
                System.out.println("厨师做好了一碗面条！");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
