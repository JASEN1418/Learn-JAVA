package com.JASEN1418.practice.practice7;

public class Dog2 extends Dog{
    @Override
    public void Eat(){
        System.out.println("一只叫做"+name+"的"+age+"岁的哈士奇，正在吃骨头，边吃边拆家");
    }

    public Dog2(String name, int age) {
        super(name, age);
    }

    public Dog2() {
    }
}