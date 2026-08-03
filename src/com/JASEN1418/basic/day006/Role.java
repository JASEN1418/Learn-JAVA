package com.JASEN1418.basic.day006;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private int maxattack;

    public int getMaxattack() {
        return maxattack;
    }

    public void setMaxattack(int maxattack) {
        this.maxattack = maxattack;
    }

    public Role(String name, int blood, int maxattack){
        this.name=name;
        this.blood=blood;
        this.maxattack=maxattack;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int attack(Role a){
        Random random=new Random();
        int val=random.nextInt(this.maxattack);
        System.out.println(this.name+"对"+a.name+"造成了"+val+"点伤害！");
        int p=a.hit(val);
        return p;
    }

    public void defense(Role a){
        System.out.println(a.name+"这次攻击无效！！！");
    }

    public int hit(int val){
        int p=0;
        this.blood-=val;
        if(this.blood<=0){
            System.out.println(this.name+"受到致命伤害，阵亡！");
            p=1;
        }
        return p;
    }
}
