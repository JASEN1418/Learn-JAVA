package com.JASEN1418.basic.day011;

public final class Frog extends Animal{
    public Frog(String name,int age){
        super(name,age);
    }

    @Override
    public final void Action(){
        System.out.println("吃虫子！");
    }
}
