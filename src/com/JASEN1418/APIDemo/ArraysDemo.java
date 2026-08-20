package com.JASEN1418.APIDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String s= Arrays.toString(arr);
        System.out.println(s);

        int[] arr2=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr2));
        int[] arr3=Arrays.copyOfRange(arr,0,5);
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,20));

        int[] arr4=new int[5];
        Arrays.fill(arr4,0);
        System.out.println(Arrays.toString(arr4));

        Integer[] arr5={14,18,24,65,34,25,19,64,94};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
        Arrays.sort(arr5,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr5));
    }
}
