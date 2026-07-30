package com.JASEN1418.basic.day005;

import java.util.Objects;

public class GirlFriend {
    private String name;
    private int age;
    private String hobby;
    private final String Lover="fengxue";
    public final static String word="I Love you forever!";

    public GirlFriend(){
        this("匿名",18,"play game","fengxue","I love you!");
    }

    public GirlFriend(String name, int age, String hobby, String Lover, String word){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
    }

    public void SendGift(String gift){
        System.out.println(this.name+"收到了你送的"+gift+",并表示非常喜欢!");
    }

    public void Talk(){
        System.out.println("我们要一直走下去！要幸福！");
    }

    public void Play(){
        System.out.println(this.name+"想你了，陪我玩玩好不好嘛！");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof GirlFriend that)) return false;
        return age == that.age && Objects.equals(name, that.name);
    }

}
