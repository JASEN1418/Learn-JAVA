package com.JASEN1418.MyFlie;

import java.io.File;
import java.io.IOException;

public class CreatandDelete {
    public static void main(String[] args) throws IOException {

        //如果父级路径不存在会出现IOException异常
        //creatNewFile只能创建文件
        File f1=new File("D:\\temp\\b.txt");
        boolean p = f1.createNewFile();
        System.out.println(p);

        //创建文件夹 可创建多级文件夹
        File f2=new File("D:\\temp\\aaa\\aa");
        boolean a=f2.mkdirs();
        System.out.println(a);


        //如果删除的是文件或者空文件夹 将直接删除不会在回收站
        //有内容的文件夹会删除失败
        f2.delete();
        f1.delete();
    }
}
