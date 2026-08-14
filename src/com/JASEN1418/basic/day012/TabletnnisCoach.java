package com.JASEN1418.basic.day012;

public class TabletnnisCoach extends Coach implements SpeakSomething {
    public TabletnnisCoach(int age, String name) {
        super(age, name);
    }

    public TabletnnisCoach() {
    }

    @Override
    public void work(){
        System.out.println("教学乒乓球！");
    }

    @Override
    public void Speak(){
        System.out.println("说英语！");
    }
}
