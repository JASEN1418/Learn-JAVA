package com.JASEN1418.basic.day011;

public abstract class Animal {
    public final static int animalnumber;
    private String name;
    private int age;

    static {
        System.out.println("初始化信息");
        animalnumber=3;
    }

    public void DrinkWater(){
        System.out.println("正在喝水！");
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void Action();
}
