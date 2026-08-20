package com.JASEN1418.APIDemo;

import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeToolsDemo {
    public static void main(String[] args) {
        // 当前本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 生日的 年月日
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);//第二个参数减第一个参数

        System.out.println("相差的时间间隔对象:" + period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());


        // 本地日期时间对象。
        LocalDateTime ntoday = LocalDateTime.now();
        System.out.println(ntoday);

        // 出生的日期时间对象
        LocalDateTime nbirthDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(nbirthDate);

        Duration duration = Duration.between(nbirthDate, ntoday);//第二个参数减第一个参数
        System.out.println("相差的时间间隔对象:" + duration);

        System.out.println("============================================");
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数


        // 当前时间
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println(today1);
        // 生日时间
        LocalDateTime birthDate1 = LocalDateTime.of(2000, 1, 1,
                0, 0, 0);
        System.out.println(birthDate1);

        System.out.println("相差的年数:" + ChronoUnit.YEARS.between(birthDate1, today1));
        System.out.println("相差的月数:" + ChronoUnit.MONTHS.between(birthDate1, today1));
        System.out.println("相差的周数:" + ChronoUnit.WEEKS.between(birthDate1, today1));
        System.out.println("相差的天数:" + ChronoUnit.DAYS.between(birthDate1, today1));
        System.out.println("相差的时数:" + ChronoUnit.HOURS.between(birthDate1, today1));
        System.out.println("相差的分数:" + ChronoUnit.MINUTES.between(birthDate1, today1));
        System.out.println("相差的秒数:" + ChronoUnit.SECONDS.between(birthDate1, today1));
        System.out.println("相差的毫秒数:" + ChronoUnit.MILLIS.between(birthDate1, today1));
        System.out.println("相差的微秒数:" + ChronoUnit.MICROS.between(birthDate1, today1));
        System.out.println("相差的纳秒数:" + ChronoUnit.NANOS.between(birthDate1, today1));
        System.out.println("相差的半天数:" + ChronoUnit.HALF_DAYS.between(birthDate1, today1));
        System.out.println("相差的十年数:" + ChronoUnit.DECADES.between(birthDate1, today1));
        System.out.println("相差的世纪(百年)数:" + ChronoUnit.CENTURIES.between(birthDate1, today1));
        System.out.println("相差的千年数:" + ChronoUnit.MILLENNIA.between(birthDate1, today1));
        System.out.println("相差的纪元数:" + ChronoUnit.ERAS.between(birthDate1, today1));
    }
}
