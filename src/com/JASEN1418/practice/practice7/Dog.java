package com.JASEN1418.practice.practice7;

public abstract class Dog extends Animal{
    public void Action(){
        System.out.println("看门！");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
