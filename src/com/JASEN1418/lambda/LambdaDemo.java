package com.JASEN1418.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {

        //参数类型可以省略不写
        //参数只有一个可以省略不写
        //如果方法体只有一行 return ；{} 要么同时省略要么都不省

        method(new swim() {
            @Override
            public void swiming() {
                System.out.println("正在游泳！");
            }
        });

        method(()-> {
                System.out.println("正在游泳！");
            }
        );

        method(() -> System.out.println("正在游泳！"));

        Integer[] arr1={51,32,61,94,15,62,84,612,4,16,312,15};
        Integer[] arr2={81,645,64,84,1,3651,5,48,646,48,156,5,8494};
        Integer[] arr3={484,75,48,1216,46,65454,959,645,45,87,49};
        Arrays.sort(arr1,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o1-o2;
            }
        });
        Arrays.sort(arr2,(Integer o1,Integer o2)->{
                return o1-o2;
            }
        );
        Arrays.sort(arr3,(o1,o2)->o1-o2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    public static void method(swim s){
        s.swiming();
    }

}

@FunctionalInterface//检查是否为函数式接口（只有一个抽象方法的接口）
interface swim{
    public void swiming();
}