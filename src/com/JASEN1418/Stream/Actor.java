package com.JASEN1418.Stream;

import java.util.Objects;

public class Actor {
    private String name;
    private int age;


    public Actor(String s){
        this.setName(s.split("-")[0]);
        this.setAge(Integer.parseInt(s.split("-")[1]));
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return age == actor.age && Objects.equals(name, actor.name);
    }

    @Override
    public String toString() {
        return  name + " " + age ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Actor() {
    }
}
