package com.JASEN1418.basic.day012;

public interface SpeakSomething {
    public default void Speak(){
        System.out.println("说外语！");
    }

    private static void Chinese(){
        System.out.println("说中文！");
    }

    public static void SpeakChinese(){
        Chinese();
    }
}
