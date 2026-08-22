package com.JASEN1418.practice.practice7;

public class Cat2 extends Cat{
    @Override
    public void Eat(){
        System.out.println("一只叫做"+name+"的"+age+"岁的狸花猫，正在吃小鱼干");
    }

    public Cat2(String name, int age) {
        super(name, age);
    }

    public Cat2() {
    }
}
