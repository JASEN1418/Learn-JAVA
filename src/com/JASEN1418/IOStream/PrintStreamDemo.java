package com.JASEN1418.IOStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //如果初始化字符流 可以加个参数true表示自动刷新
        PrintStream ps=new PrintStream("D:\\temp\\a.txt");

        ps.print(97);
        ps.println();
        ps.printf("%snb","feixue");

        ps.close();
    }
}
