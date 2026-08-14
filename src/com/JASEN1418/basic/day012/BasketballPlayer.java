package com.JASEN1418.basic.day012;

public class BasketballPlayer extends Player {
    public BasketballPlayer(int age, String name) {
        super(age, name);
    }

    public BasketballPlayer() {
    }

    @Override
    public void work(){
        System.out.println("练习篮球！");
    }
}
