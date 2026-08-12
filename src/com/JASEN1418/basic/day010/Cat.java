package com.JASEN1418.basic.day010;

public class Cat extends Animal{
    public Cat(String colour, int age) {
        super(colour, age);
    }

    public Cat() {
    }

    public void CatchMouse(){
        System.out.println(super.Age+"岁的"+super.colour+"的猫正在抓老鼠！");
    }

    @Override
    public void EatSomething(String something){
        System.out.println(super.Age+"岁的"+super.colour+"的猫正在吃"+something);
    }
}
