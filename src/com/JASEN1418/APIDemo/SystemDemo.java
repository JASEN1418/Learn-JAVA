package com.JASEN1418.APIDemo;

public class SystemDemo {
    public static void main(String[] args) {
        //获取当前时间
        //以1970年1月1日早上8点为0
        long old = System.currentTimeMillis();

        int[] arr1={1,2,3,4,5,2,0,1,3,1,4,6,7,8,9};
        int[] arr2=new int[7];

        //基础数据类拷贝必须类型一样
        //引用数据可以子类拷贝给父类
        System.arraycopy(arr1,4,arr2,0,7);

        //测试深浅拷贝
        arr1[4]=520;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        //获取当前时间
        long now =System.currentTimeMillis();

        System.out.println();
        System.out.println(now-old);//输出运行时间

        System.exit(0);//关闭虚拟机，结束整个程序

        System.out.println("难道程序还没有结束吗！");
    }
}
