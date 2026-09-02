package com.JASEN1418.MyThread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Foodie extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.Max_FoodNumber==0){
                    break;
                }
                else {
                    if(Desk.foodFlag==1){
                        Desk.Max_FoodNumber--;
                        System.out.println("顾客正在吃饭，预计还可以吃"+ Desk.Max_FoodNumber+"碗！");
                        Desk.foodFlag=0;
                        Desk.lock.notify();
                    }else{
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
