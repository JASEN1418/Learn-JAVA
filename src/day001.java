import java.util.Scanner;//引用键盘录入类
public class day001 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        for (int i = 1; i <= 9; i++) {
            for(int j=1;j<=i;j++){
                System.out.printf(j+"*"+i+"="+i*j+'\t');
            }
            System.out.printf("\n");
        }

    }
}
