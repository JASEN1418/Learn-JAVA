package com.JASEN1418.MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
    public static volatile int foodFlag=0;

    public static volatile int Max_FoodNumber=10;

    public static Lock lock=new ReentrantLock();
}
