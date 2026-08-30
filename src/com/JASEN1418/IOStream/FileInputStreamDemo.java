package com.JASEN1418.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("D:\\temp\\a.txt");
        FileOutputStream fo=new FileOutputStream("D:\\temp\\aaa\\bbb\\b.txt");

//        int a=0;
//        while((a=fi.read())!= -1){
//            fo.write(a);
//        }

        byte[] arr=new byte[2];
        String s;int len=0;
        while((len=fi.read(arr))!=-1){
            System.out.print(new String(arr,0,len));
            fo.write(arr,0,len);
        }


        fi.close();
        fo.close();

    }
}
