package com.JASEN1418.MyThread;

import java.util.concurrent.*;

public class ThreadpoolDemo {
    public static void main(String[] args) {

        ExecutorService pool1= Executors.newFixedThreadPool(3);
        ExecutorService pool2= Executors.newCachedThreadPool();

        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());

        pool1.shutdown();
        pool2.shutdown();

        ThreadPoolExecutor mypool=new ThreadPoolExecutor(
                3,//核心线程 大于0
                6,//最大线程数 大于核心线程
                60,//空闲线程存活的最大时间值
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(3),//任务队列
                Executors.defaultThreadFactory(),//线程工厂
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略
        );
    }
}
