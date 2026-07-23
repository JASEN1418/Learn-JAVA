import java.util.Random;
import java.util.Scanner;

public class day003 {
    public static boolean IsPrime(long x){
        if(x==0||x==1)return false;
        if(x==2||x==3)return true;
        if(x%2==0||x%3==0)return false;
        for(int i=5;i*i<x;i+=6){
            if(x%i==0||x%(i+2)==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("请输入日期:");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        if(day>=1&&day<=5) System.out.println("workday!");
        else if(day==6||day==7)System.out.println("holiday!");
        else System.out.println("worry!");
        switch(day){
            case 1,2,3,4,5:{
                System.out.println("加油!");
                break;
            }
            case 6,7:{
                System.out.println("玩得开心点！");
                break;
            }
            default:{
                System.out.println("请输入正确的日期");
                break;
            }
        }
        int ans=0;
        for(int i=1;i<=100;i++){
            ans+=i;
        }
        System.out.println("1到100的累加和："+ans);
        System.out.println("请输入一个数，我将为你计算其算术平方根(向下取整)");
        long x=sc.nextLong();
        long l=1,r=x;
        while(l<r){
            if(r-l==1)break;
            long mid=(l+r)/2;
            if(mid*mid>x)r=mid;
            else if(mid*mid<x)l=mid;
            else{
                l=mid;break;
            }
        }
        if(x==0||x==1) System.out.println("x的算术平方根："+x);
        else System.out.println("x的算数平方根："+l);
        System.out.println("请输入一个数，我将为你判断是否为质数");
        long y=sc.nextLong();
        if(day003.IsPrime(y)) System.out.println("yeah!这是一个质数！");
        else System.out.println("oh,no!这不是一个质数！");
        Random ra=new Random();
        int tar=ra.nextInt(100);
        System.out.println("下面开始猜数字游戏：");
        int z=sc.nextInt();
        while(z!=tar){
            if(z>tar) System.out.println("WA!太大了！");
            else if(z<tar) System.out.println("WA！太小了！");
            z=sc.nextInt();
        }
        System.out.printf("AC!");
    }
}
