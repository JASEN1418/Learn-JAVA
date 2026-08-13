package com.JASEN1418.basic.day011;

public final class Sheep extends Animal{
    public Sheep(String name,int age){
        super(name,age);
    }

    @Override
    public final void Action(){
        System.out.println("吃草！");
    }
}
