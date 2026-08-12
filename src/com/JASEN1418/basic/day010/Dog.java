package com.JASEN1418.basic.day010;

public class Dog extends Animal{
    public void LookHome(){
        System.out.println(super.Age+"岁的"+super.colour+"的小狗正在看家！");
    }

    public Dog() {
    }

    public Dog(String colour, int age) {
        super(colour, age);
    }

    @Override
    public void EatSomething(String something){
        System.out.println(super.Age+"岁的"+super.colour+"的狗正在吃"+something);
    }
}
