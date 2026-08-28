package com.JASEN1418.MyFlie;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("D:\\temp\\a.txt");
        //判断是否为文件夹
        System.out.println(file.isDirectory());
        //判断是否为文件
        System.out.println(file.isFile());
        //判断是否存在
        System.out.println(file.exists());

        long len=file.length();
        System.out.println(len);

        //获取绝对路径
        String path1=file.getAbsolutePath();
        System.out.println(path1);
        //获取创建时的路径
        String path2= file.getPath();
        System.out.println(path2);
        //获取文件名字
        String name= file.getName();
        System.out.println(name);
        //获取最后一次修改的时间（ms
        long time=file.lastModified();
        System.out.println(time);

        SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s.format(new Date(time)));

        //获取该路径下的全部内容
        File[] f=file.listFiles();
        System.out.println(f);
    }
}
