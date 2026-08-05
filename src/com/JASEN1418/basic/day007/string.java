package com.JASEN1418.basic.day007;

public class string {
    String []arr={"〇","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
    public String repalce(String a){
        StringBuilder na=new StringBuilder("");
        for (int i = 0; i < a.length(); i++) {
            char b=a.charAt(i);
            if(b-'0'>=0&&b-'0'<=9){
                na.append(arr[b-'0']);
            }
        }
        return na.toString();
    }
    public String rotate(String a){
        String end=a.substring(1);
        char front=a.charAt(0);
        String na=end+front;
        return na;
    }
}
