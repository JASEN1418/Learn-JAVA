package com.JASEN1418.MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo extends Thread{
    public static volatile int ticket=0;

    public static Lock lock=new ReentrantLock();

    public LockDemo() {
    }

    public LockDemo(String name) {
        super(name);
    }

    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
                lock.lock();
                if(ticket<100){
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票！");
                }else{
                    break;
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
