package com.JASEN1418.APIDemo;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {

        //获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //JVM能获取的最大内存
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //JVM已获取的内存
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        //JVM剩余内存
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //cmd命令
        //shutdown -s    在一分钟后关机
        //shutdown -s -t 在ts后关机
        //shutdown -a    取消关机
        //shutdown -r    重启
        Runtime.getRuntime().exec("notepad");

        Runtime.getRuntime().exit(0);

    }
}
