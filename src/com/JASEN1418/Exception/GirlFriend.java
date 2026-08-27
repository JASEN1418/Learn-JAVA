package com.JASEN1418.Exception;

import java.util.Objects;

public class GirlFriend {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GirlFriend that = (GirlFriend) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return  name + " " + age ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name.length()>10){
            throw new NameFormatException(name+"格式不符合要求");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18||age>24){
            throw new AgeOutofBoundsException(age+"超过最大限制或小于最小限制");
        }
        this.age = age;
    }

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
