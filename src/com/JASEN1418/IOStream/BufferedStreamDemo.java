package com.JASEN1418.IOStream;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //只是对基本流进行了包装
        //提高了运行效率
//        BufferedInputStream bi=new BufferedInputStream(new FileInputStream("D:\\temp\\a.txt"));
//        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("D:\\temp\\aaa\\bbb\\b.txt"));
//
//        int a=0;
//        while ((a=bi.read())!=-1){
//            bo.write(a);
//        }
//        bi.close();
//        bo.close();

        BufferedReader br=new BufferedReader(new FileReader("D:\\temp\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\temp\\aaa\\bbb\\b.txt"));

        String s="";
        while((s=br.readLine())!=null){
            bw.write(s);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
