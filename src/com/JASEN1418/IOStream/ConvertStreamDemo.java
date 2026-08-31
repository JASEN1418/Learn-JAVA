package com.JASEN1418.IOStream;

import java.io.*;

public class ConvertStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\temp\\a.txt")));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
