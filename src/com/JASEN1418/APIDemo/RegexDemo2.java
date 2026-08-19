package com.JASEN1418.APIDemo;

public class RegexDemo2 {
    public static void main(String[] args) {

        String str1="风雪asbfasfasfa绯雪aghgsdfhsfd长离";
        String stringregex1="[\\w&&[^_]]+";
        String res1=str1.replaceAll(stringregex1,"vs");
        System.out.println(res1);

        String[] arr=str1.split(stringregex1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //特别注意加了？的基本上都是非捕获分组，不占用组号
        String regex="(.+).+\\1";
        System.out.println("abdba".matches(regex));
        System.out.println("123456".matches(regex));
        System.out.println("1234567891".matches(regex));
        System.out.println("00000".matches(regex));

        System.out.println("------------------");

        String regex1="((.)\\2+).+\\1";
        System.out.println("aaabbbaaa".matches(regex1));
        System.out.println("123456".matches(regex1));
        System.out.println("1234567891".matches(regex1));
        System.out.println("00000".matches(regex1));

        String str="我我我我我要要要要要要要要学学学学学学编编程程程";
        String res = str.replaceAll("(.)\\1+", "$1");
        System.out.println(res);
    }
}
