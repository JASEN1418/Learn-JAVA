package com.JASEN1418.APIDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //单位为ms
        Date a=new Date(0L);
        long time=a.getTime();
        time+=1000L*60*60*24*365;
        a.setTime(time);
        System.out.println(a);

        Random ra=new Random();
        Date d1=new Date(Math.abs(ra.nextInt()));
        Date d2=new Date(Math.abs(ra.nextInt()));
        long time1=d1.getTime();
        long time2=d2.getTime();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(Math.max(time1,time2));

        Date now =new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        String s=simpleDateFormat.format(now);
        System.out.println(s);

        Date temp=simpleDateFormat.parse(s);
        System.out.println(temp);
    }
}
