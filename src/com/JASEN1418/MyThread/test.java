package com.JASEN1418.MyThread;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("窗口买票即将开始！");
        Thread.sleep(1000);

        SynchronizedDemo s1=new SynchronizedDemo("窗口一");
        SynchronizedDemo s2=new SynchronizedDemo("窗口二");
        SynchronizedDemo s3=new SynchronizedDemo("窗口三");
        SynchronizedDemo s4=new SynchronizedDemo("窗口四");

        s1.start();s2.start();s3.start();s4.start();
        s1.join();s2.join();s3.join();s4.join();

        System.out.println("========================");
        System.out.println("平台买票即将开始！");

        Thread.sleep(2000);

        LockDemo l1=new LockDemo("平台一");
        LockDemo l2=new LockDemo("平台二");
        LockDemo l3=new LockDemo("平台三");
        LockDemo l4=new LockDemo("平台四");

        l1.start();l2.start();l3.start();l4.start();

    }
}
