package com.JASEN1418.MyFlie;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class test {

    public static Map<String,Integer> map=new HashMap<>();

    public static void main(String[] args) {
        File f=new File("D:\\temp\\aaa");
        find(f);
        map.forEach((s, integer) -> System.out.println(s+"  "+integer));
    }

    public static void find(File f){
        File[] arr=f.listFiles();
        if(arr!=null){
            for (File file : arr) {
                if(file.isFile()){
                    String s=file.getAbsolutePath();
                    String temp=s.split("\\.")[(s.split("\\.").length)-1];
                    if(map.containsKey(temp))map.put(temp,map.get(temp)+1);
                    else map.put(temp,1);
                }
                else{
                    find(file);
                }
            }
        }
    }
}
