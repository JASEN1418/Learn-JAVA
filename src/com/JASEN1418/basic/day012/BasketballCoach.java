package com.JASEN1418.basic.day012;

public class BasketballCoach extends Coach {
    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    public BasketballCoach() {
    }

    @Override
    public void work(){
        System.out.println("教学篮球！");
    }
}
