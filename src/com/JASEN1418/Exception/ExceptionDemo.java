package com.JASEN1418.Exception;

public class ExceptionDemo {
    public static void main(String[] args) {

        //JDK7之后catch里面可以处理多个异常
        //异常1|异常2 类似case穿透

        int[] arr={1,2,3,4,5};
//         try{
//             System.out.println(arr[0]);
//             System.out.println(2/1);
//             String s=null;
//             boolean a=s.equals("111");
//         }catch (IndexOutOfBoundsException e){
//             System.out.println("数组越界！");
//         }catch (ArithmeticException e){
//             System.out.println("除数不能为零！");
//         }catch (NullPointerException e){
//             System.out.println("空指针异常！");
//         }catch (Exception e){
//             System.out.println("未知异常！");
//         }

        try{
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s=null;
            boolean a=s.equals("111");
        }catch (IndexOutOfBoundsException|ArithmeticException|NullPointerException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("未知异常！");
        }

        //输出红色的错误信息（输出顺序不一定，后面多线程会学
        System.err.println("1111");

        int[] arr1=new int[0];
        int max=0;
        try {
            max=getmax(arr1);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.err.println("error");

    }

    public static int getmax(int[] arr){
        if(arr==null){
            throw new NullPointerException();
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max=0;
        for (int i : arr) {
            max=i>max?i:max;
        }
        return max;
    }
}
