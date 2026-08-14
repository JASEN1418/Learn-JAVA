package com.JASEN1418.basic.day012;

public class test {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer=new BasketballPlayer(18,"zhangsan");
        BasketballCoach basketballCoach=new BasketballCoach(34,"lisi");
        TabletennisPlayer tabletnnisPlayer=new TabletennisPlayer(19,"lihua");
        TabletnnisCoach tabletnnisCoach=new TabletnnisCoach(32,"wangmazi");
        System.out.printf(basketballPlayer.getAge()+"岁的"+basketballPlayer.getName());
        basketballPlayer.work();
        System.out.printf(basketballCoach.getAge()+"岁的"+basketballCoach.getName());
        basketballCoach.work();
        System.out.printf(tabletnnisPlayer.getAge()+"岁的"+tabletnnisPlayer.getName());
        tabletnnisPlayer.work();
        System.out.printf(tabletnnisPlayer.getAge()+"岁的"+tabletnnisPlayer.getName());
        tabletnnisPlayer.Speak();
        System.out.printf(tabletnnisCoach.getAge()+"岁的"+tabletnnisCoach.getName());
        tabletnnisCoach.work();
        System.out.printf(tabletnnisCoach.getAge()+"岁的"+tabletnnisCoach.getName());
        tabletnnisCoach.Speak();
        System.out.printf(tabletnnisCoach.getAge()+"岁的"+tabletnnisCoach.getName());
        SpeakSomething.SpeakChinese();
    }
}
