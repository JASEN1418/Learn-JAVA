package com.JASEN1418.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\temp\\a.txt");

        char[] arr=new char[2];
        int len=0;
        while((len=fr.read(arr))!=-1){
            System.out.print(new String(arr,0,len));
        }

        FileWriter fw=new FileWriter("D:\\temp\\a.txt",true);

        String s="\n我想陪在大家身边，从过去一同迈向明天！";
        fw.write(s,0,s.length());

        fw.close();

//        FileReader f=new FileReader();
//        FileWriter nf=new FileWriter();
//
//        int b=0;
//        while((b=f.read())!=-1){
//            nf.write(b^2);
//        }
//
//        f.close();
//        nf.close();
    }
}
