package com.JASEN1418.APIDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Date d1=new Date(0L);
        Calendar c= Calendar.getInstance();
        System.out.println(c);

        Date d2=c.getTime();
        System.out.println(d2);

        c.setTime(d1);
        System.out.println(c.getTime());
        long timeInMillis = c.getTimeInMillis();
        System.out.println(timeInMillis);

        c.setTimeInMillis(1000L*60*60*24*365);
        System.out.println(c.getTime());

        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;//获取的月份为0-11
        int date=c.get(Calendar.DAY_OF_MONTH);
        int week=c.get(Calendar.DAY_OF_WEEK);//星期天为第一天
        System.out.println(year+"年"+month+"月"+date+"日"+"  "+GetWeek(week));

        c.set(Calendar.YEAR,2000);year=c.get(Calendar.YEAR);
        System.out.println(year+"年"+month+"月"+date+"日"+"  "+GetWeek(week));
        c.add(Calendar.YEAR,1);year=c.get(Calendar.YEAR);
        System.out.println(year+"年"+month+"月"+date+"日"+"  "+GetWeek(week));

    }
    public static String GetWeek(int week){
        String[] weekday={"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weekday[week];
    }
}
