package com.JASEN1418.MyThread;

public class MyRun2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"@"+i);
            Thread.yield();
        }
    }
}
