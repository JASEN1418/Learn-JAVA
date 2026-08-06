package com.JASEN1418.basic.day008;

public class Student {
    public String name;
    public String id;
    private int mark;
    private String PhoneNumber;
    private int age;

    public Student(){

    }

    public Student(String name, String id, int mark, String phoneNumber, int age) {
        this.name = name;
        this.id = id;
        this.mark = mark;
        PhoneNumber = phoneNumber;
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
