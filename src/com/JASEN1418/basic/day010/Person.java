package com.JASEN1418.basic.day010;

public class Person {
    public String name;
    public int age;

    public void KeepPet(Animal animal,String something){
        if(animal instanceof Dog d){
            System.out.println("年龄为"+this.age+"的"+this.name+"养了一只"+
                    d.getColour()+"颜色的"+d.getAge()+"岁小狗");
            d.EatSomething(something);
            d.LookHome();
        }
        if(animal instanceof Cat c){
            System.out.println("年龄为"+this.age+"的"+this.name+"养了一只"+
                    c.getColour()+"颜色的"+c.getAge()+"岁小猫");
            c.EatSomething(something);
            c.CatchMouse();
        }
    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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


}
