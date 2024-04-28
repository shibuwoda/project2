import java.util.Scanner;

public class Demo23 {
    public static void main(String args []){
        /**
         * 对一组数字进行倒序打印
         * 缺点：有上限，采用数组方法
         */
        Scanner K=new Scanner(System.in);
        System.out.println("请输入一串数字：");
        int m= K.nextInt();
        opposite(m);
    }
    public static void opposite(int i){
        for (int j=i;j!=0;j=j/10){
            System.out.print(j%10);

        }
    }
}
