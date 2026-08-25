package com.JASEN1418.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class practice8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String temp=sc.next();
            list.add(temp);
        }

        Random ra=new Random();
        System.out.println(list.get(ra.nextInt(n)));

        Collections.shuffle(list);
        System.out.println(list);
    }
}
