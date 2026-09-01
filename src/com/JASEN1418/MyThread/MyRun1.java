package com.JASEN1418.MyThread;

public class MyRun1 extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++) {
            System.out.println(getName());
        }
    }
}
