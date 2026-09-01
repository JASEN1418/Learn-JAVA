package com.JASEN1418.MyThread;

public class SynchronizedDemo extends Thread{
    public static volatile int ticket=0;

    public SynchronizedDemo() {
    }

    public SynchronizedDemo(String name) {
        super(name);
    }

    @Override
    public void run(){
        while (true) {
            synchronized (SynchronizedDemo.class){
                if(ticket<100){
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票！");
                }else{
                    break;
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized boolean method(){
        if(ticket<100){
            ticket++;
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票！");
            return true;
        }else{
            return false;
        }
    }
}
