package com.JASEN1418.APIDemo;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    //[a-z]     a到ztrue
    //^         取反
    //[]嵌套    或者
    //&&       而且
    //\\d     数字
    //\\D     非数字
    //.       任意字符
    //\\W     非单词字符即非\\w
    //\\w     可命名的字符
    //\\s     空白字符
    //\\S     非空白字符
    //X?       零次或一次
    //X+       零次或多次
    //X*      一次或多次
    //X {n}    恰好n次
    //X {a,b} 出现次数在ab之间

    public static void main(String[] args) throws IOException {
        System.out.println("a".matches("[a-bb-c[c-d]&&[^d-e]\\w{1,2}]"));

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个11位的+86号码");
        String a=sc.next();
        String regex1="1[3-9]\\d{9}";
        if(!a.matches(regex1)) System.out.println("号码错误");

        System.out.println("请输入学号");
        String regex2="\\d{4}0[1-9]0[1-9a-z]\\d{2}";
        String b=sc.next();
        if(!b.matches(regex2)) System.out.println("未知学号");

        System.out.println("请输入6-20位的合理用户名");
        String regex3="\\w{6,20}";
        String c=sc.next();
        if(!c.matches(regex3)) System.out.println("用户名不合理！");

        System.out.println("请输入身份证");
        String d=sc.next();
        String regex4="[1-9]\\d{5}(18|19|20)\\d{2}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}[0-9(?i)X]";
        if(!d.matches(regex4)) System.out.println("身份证不合理！");

        //本地爬虫
        String s="都说JAVA开发很赚钱， 我苦心专研了两年，其中参加了不少的培训。\n" +
                "刚培训完两个星期我就收到了美团网的offer , 我承认我不是班里学习最好的。\n" +
                "但我却是班里第一个找到工作的， 而且还是个大厂我一-直相信勤能补拙。\n" +
                "只要有决心什么事都是可以做到的，今天入职一个星期了。\n" +
                "公司的人对我都很好，还给我配了电动车和头盔还有大衣。\n" +
                "不说了又接了个外卖。";
        String regex="\\W";
        Pattern p=Pattern.compile(regex);//获取正则表达式对象
        //获取文本匹配器对象
        //按规则p爬取字符串
        Matcher m=p.matcher(s);

        while(m.find()){
            String str=m.group();
            System.out.print(str);
        }
        //正则表达式一些用法
        // ?i 忽略大小写
        // ?= 获取前面+=后面的字符串，但是后面的不爬取
        // ?: 获取前面+：后面的字符串，后面的也爬取
        // ?! 获取前面+除了！后面的字符串
        // ab+  对b贪婪爬取，尽可能多的爬取
        // ab+? 对b非贪婪爬取，尽可能少爬取

        //网路爬虫
//        URL url=new URL("xxxxxxx.com");
//        URLConnection urlConnection =url.openConnection();
//
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//        String line;
//        String regex5="[1-9]{17,}";
//        Pattern pattern=Pattern.compile(regex5);
//        while((line=bufferedReader.readLine())!=null){
//            System.out.println(line);
//            Matcher matcher=pattern.matcher(line);
//            while(matcher.find()){
//                System.out.println(matcher.group());
//            }
//        }
//        bufferedReader.close();
    }
}
