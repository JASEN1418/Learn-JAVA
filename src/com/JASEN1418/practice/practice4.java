package com.JASEN1418.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class practice4 {
    public static void main(String[] args) {
        //用JDK7和JDK8的时间方法获取目前离2000，1，1的天数
        Date d=new Date();
        Date old=new Date(0L);
        Calendar c= Calendar.getInstance();
        c.setTime(old);
        c.set(Calendar.YEAR,2000);
        System.out.println(c);
        old=c.getTime();
        long timeold=old.getTime();
        long timenow=d.getTime();
        System.out.println((timenow-timeold)/1000/3600/24);

        LocalDate a=LocalDate.of(2000,1,1);
        LocalDate nnow=LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(a, nnow));
    }
}
