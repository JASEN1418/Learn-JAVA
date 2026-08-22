package com.JASEN1418.practice.practice7;

public abstract class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    public void Action(){
        System.out.println("蹭了蹭你，想吃猫条");
    }
}
