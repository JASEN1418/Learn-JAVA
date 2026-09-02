package com.JASEN1418.MyInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress i=InetAddress.getByName("LAPTOP-P4VUQLAQ");//设备名称或者地址
        System.out.println(i);

        String name=i.getHostName();
        System.out.println(name);

        String ip=i.getHostAddress();
        System.out.println(ip);
    }
}
