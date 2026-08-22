package com.JASEN1418.practice.practice7;

public class Dog1 extends Dog{
    @Override
    public void Eat(){
        System.out.println("一只叫做"+name+"的"+age+"岁的泰迪，正在吃骨头，边吃边蹭");
    }

    public Dog1(String name, int age) {
        super(name, age);
    }

    public Dog1() {
    }
}
