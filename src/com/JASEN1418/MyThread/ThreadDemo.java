package com.JASEN1418.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRun1 t1=new MyRun1();
        MyRun1 t2=new MyRun1();
        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
        //插入线程 先执行该线程
        t1.join();
        t2.join();

        Thread.sleep(1000);

        Thread t3=new Thread(new MyRun2());
        Thread t4=new Thread(new MyRun2());
        t3.setName("520");
        t4.setName("1314");
        t3.setPriority(10);
        t4.setPriority(1);
        //守护线程
        //当非守护线程停止  守护线程会陆续停止
        t4.setDaemon(true);

        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        Thread.sleep(2000);

        t3.start();
        t4.start();

        Thread.sleep(1000);

        MyRun3 t5=new MyRun3();
        FutureTask<Integer> ft=new FutureTask<>(t5);
        Thread t=new Thread(ft);
        t.start();
        Integer res=ft.get();
        System.out.println(res);
    }
}
