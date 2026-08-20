package com.JASEN1418.APIDemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        Set<String> zoneids= ZoneId.getAvailableZoneIds();
        System.out.println(zoneids.size());
        System.out.println(zoneids);

        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId nzoneId=ZoneId.of("Asia/Chongqing");
        System.out.println(nzoneId);
    }
}
