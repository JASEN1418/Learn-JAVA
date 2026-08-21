package com.JASEN1418.MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("aaa");
        coll.add("eee");

        Iterator<String> it= coll.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
            if("aaa".equals(str))it.remove();
        }
        System.out.println(coll);

        //此遍历不能改变值
        for (String s : coll) {
            System.out.println(s);
        }

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach(s->System.out.println(s));
    }
}
