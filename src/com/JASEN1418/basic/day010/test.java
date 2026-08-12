package com.JASEN1418.basic.day010;

public class test {
    public static void main(String[] args) {
        Person p1=new Person("张三",20);
        Person p2=new Person("李四",21);
        Cat c=new Cat("白色",2);
        Dog d=new Dog("金色",4);
        p1.KeepPet(d,"鸡腿");
        p2.KeepPet(c,"猫条");
    }
}
