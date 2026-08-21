package com.JASEN1418.MyCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add(0,"eee");
        System.out.println(list);

        String s1=list.get(0);
        System.out.println(s1);

        list.remove(0);
        System.out.println(list);

        list.set(0,"abc");
        System.out.println(list);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            if(s.equals("bbb"))it.remove();
            System.out.print(s);
        }
        System.out.println();

        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
        System.out.println();

        ListIterator<String> its=list.listIterator();
        while(its.hasNext()){
            String s=its.next();
            if(s.equals("abc"))its.add("aaa");
            System.out.println(s);
        }
        System.out.println(list);
    }
}
