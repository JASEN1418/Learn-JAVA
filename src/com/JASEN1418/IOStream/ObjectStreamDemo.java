package com.JASEN1418.IOStream;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s=new Student("zhangsan",19);


        //如果有多个对象要序列化
        //放入集合中 一起序列化 一起读
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\temp\\a.txt"));

        oos.writeObject(s);
        System.out.println("写入完毕！");
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\temp\\a.txt"));

        Student stu=(Student) ois.readObject();

        System.out.println(stu);
        ois.close();
    }
}
