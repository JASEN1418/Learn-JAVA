import java.util.Scanner;//键盘录入类

public class day002 {
    public static void main(String[] args) {
        boolean bool=false;
        long a=999999999L;//不是idea，long记得加L
        System.out.println(a);
        String name="feng xue";//String s要大写
        System.out.println(name);
        Scanner sc=new Scanner(System.in);//创建键盘录入对象,此对象可以重复利用
        a=sc.nextInt();//键盘录入
        long b=sc.nextInt();
        System.out.println(a+b);
        int test=sc.nextInt();
        while(test>0){
            int temp=test%10;
            System.out.print(temp+" ");
            test/=10;
        }
        System.out.printf("\n");
        if(a==520|b==1314000)System.out.println("yes");
        if(a==520&b==1314000) System.out.println("I love you!");//注意与和或都少一个符号

        if(a==520||b==1314000)System.out.println("yes");
        if(a==520&&b==1314000) System.out.println("I love you!");
        //一般还是用原来的短路逻辑符号    cpp风格&&和||
        //区别在于一旦可以确定短路直接结束，而&和|还要继续检索
        long max=a>b?a:b;//三目运算符和cpp一模一样
        System.out.printf("max");
    }
}
