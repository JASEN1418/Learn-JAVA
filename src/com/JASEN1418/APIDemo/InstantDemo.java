package com.JASEN1418.APIDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant now= Instant.now();
        System.out.println(now);

        Instant instant1=Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant2=Instant.ofEpochSecond(1L);
        System.out.println(instant2);
        Instant instant3=Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(instant3);

        ZonedDateTime time=Instant.now().atZone(ZoneId.of("Asia/Chongqing"));
        System.out.println(time);

        boolean res1=instant2.isAfter(instant1);
        System.out.println(res1);
        boolean res2=instant2.isBefore(instant1);
        System.out.println(res2);

        Instant instant4=Instant.ofEpochSecond(100000L);
        System.out.println(instant4);
        Instant instant5=instant4.minusSeconds(10000L);
        System.out.println(instant5);

        Instant instant6=instant4.plusSeconds(100000L);
        System.out.println(instant6);
    }
}
