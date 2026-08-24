import java.util.Scanner;

public class day004 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)arr[i]/=2;
            else arr[i]*=2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("请输入一个一个数的次幂\n我将为你计算：（快速幂函数）");
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();long b=sc.nextLong();
        System.out.println(day004.qpow(a,b));
        swap(a,b);
        System.out.println(a+" "+b);//值传递
    }

    public static long qpow(long x,long y){
        long mod=(long)1e9+7;
        long ans=1;
        while(y!=0){
            if(y%2==1)ans=ans*x%mod;
            x=x*x%mod;
            y>>=1;
        }
        return ans;
    }

    public static void swap(long a,long b){
        long temp=a;
        a=b;
        b=temp;
    }
}
