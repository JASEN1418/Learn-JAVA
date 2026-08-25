package com.JASEN1418.MyCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        Collections.addAll(list,"abc","qwer","1234","qwer","asd","dsan","okj");

        System.out.println(list);

        //打乱
        Collections.shuffle(list);

        System.out.println(list);

        //还有常用的max/min/sort/copy/fill/binarysearch/swap
    }
}
