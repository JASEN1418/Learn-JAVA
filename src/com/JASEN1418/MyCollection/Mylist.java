package com.JASEN1418.MyCollection;

import java.util.Arrays;

public class Mylist<E> {
    Object[] obj=new Object[100];
    int size;

    public boolean add(E e){
        if(size>=100)return false;
        obj[size]=e;
        size++;
        return true;
    }

    public void addAll(E[] e){
        for (E e1 : e) {
            obj[size]=e1;
            size++;
        }
    }

    public E get(int index){return (E)obj[index];}

    @Override
    public String toString(){
        StringBuilder s=new StringBuilder();
        for (Object o : obj) {
            if(o!=null) {
                s.append(o.toString());
                s.append(" ");
            }
        }
        return s.toString();
    }
}
