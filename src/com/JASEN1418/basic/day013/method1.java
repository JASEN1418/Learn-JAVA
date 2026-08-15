package com.JASEN1418.basic.day013;

public class method1 {
    public int a=10;

    public class A{
        int a=20;
        public void method(){
            int a=30;
            System.out.println(method1.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }

    static class B{
        public void method1(){
            System.out.println("静态内部类非静态方法调用");
        }

        public static void method2(){
            System.out.println("静态内部类静态方法调用");
        }
    }
}
