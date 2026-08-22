package com.JASEN1418.practice.practice7;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Animal> arrlist=new ArrayList<>();
        Cat1 c1=new Cat1("球球",3);
        Cat2 c2=new Cat2("花花",4);
        Dog1 d1=new Dog1("八筒",5);
        Dog2 d2=new Dog2("酥酥",4);
        arrlist.add(c1);
        arrlist.add(c2);
        arrlist.add(d1);
        arrlist.add(d2);
        Keep(arrlist);
        ArrayList<Cat1> cat1ArrayList=new ArrayList<>();
        cat1ArrayList.add(c1);
        ArrayList<Cat2> cat2ArrayList=new ArrayList<>();
        cat2ArrayList.add(c2);
        ArrayList<Dog1> dog1ArrayList=new ArrayList<>();
        dog1ArrayList.add(d1);
        ArrayList<Dog2> dog2ArrayList=new ArrayList<>();
        dog2ArrayList.add(d2);
        Keep(cat1ArrayList);
        Keep(cat2ArrayList);
        Keep(dog1ArrayList);
        Keep(dog2ArrayList);
    }
    public static void Keep(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.Eat();
        }
    }
}
