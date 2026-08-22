package com.JASEN1418.practice.practice7;

public class Cat1 extends Cat{
    @Override
    public void Eat(){
        System.out.println("一只叫做"+name+"的"+age+"岁的波斯猫，正在吃小饼干");
    }

    public Cat1(String name, int age) {
        super(name, age);
    }

    public Cat1() {
    }
}
