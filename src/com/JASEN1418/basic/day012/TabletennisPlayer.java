package com.JASEN1418.basic.day012;

public class TabletennisPlayer extends Player implements SpeakSomething {
    public TabletennisPlayer(int age, String name) {
        super(age, name);
    }

    public TabletennisPlayer() {
    }

    @Override
    public void work(){
        System.out.println("练习乒乓球！");
    }

    @Override
    public void Speak(){
        System.out.println("说英语！");
    }
}
