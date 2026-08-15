package com.JASEN1418.basic.day013;

public class test {
    public static void main(String[] args) {

        method1.A test1=new method1().new A();
        test1.method();

        method1.B.method2();

        method1.B test2=new method1.B();
        test2.method1();

        method(
                new Animal() {
                    @Override
                    public void Eat() {
                        System.out.println("吃肉！");
                    }
                }
        );
    }

     public static void method(Animal a){
        a.Eat();
     }
}
