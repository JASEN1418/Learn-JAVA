package com.JASEN1418.basic.day011;

public class test {
    public static void main(String[] args) {
        Dog d=new Dog("小黑",5);
        Frog f=new Frog("呱",2);
        Sheep s=new Sheep("咩",7);
        System.out.println(d.getAge()+"岁的"+d.getName());
        d.Action();
        System.out.println(f.getAge()+"岁的"+f.getName());
        f.Action();
        System.out.println(s.getAge()+"岁的"+s.getName());
        s.Action();
    }
}
