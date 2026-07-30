package com.JASEN1418.basic.day005;

public class test {
    public static void main(String[] args) {
        GirlFriend mygirl=new GirlFriend("beloved",19,"Walk",
                "fengxue","我想陪在你身边，从过去一同迈向明天");
        System.out.println(mygirl);
        mygirl.SendGift("Rose");
        mygirl.Talk();
        mygirl.Play();
        GirlFriend badgirl=new GirlFriend("badgirl",19,"Play",
                "badman","我只是玩玩而已");
        System.out.println(badgirl);
        System.out.println("这是你的girl吗？");
        if(!mygirl.equals(badgirl))System.out.println("这个不是我的girl");
    }
}
