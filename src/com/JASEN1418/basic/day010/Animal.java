package com.JASEN1418.basic.day010;

public class Animal {
    public int Age;
    public String colour;

    public int getAge() {
        return Age;
    }

    public Animal() {

    }

    public Animal(String colour, int age) {
        this.colour = colour;
        Age = age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void EatSomething(String something){
        System.out.println("正在吃"+something);
    }
}
