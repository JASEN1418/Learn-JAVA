package com.JASEN1418.APIDemo;

import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student s){
        this.name=s.getName();
        this.age=s.getAge();
    }

    @Override
    protected Student clone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }

//    @Override
//    public Student clone(){
//        Student temp=new Student(this);
//        return temp;
//    }
}
