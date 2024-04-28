import java.util.Scanner;

public class Demo21 {
    public static void main(String args []){
        /**
         * 调用有参无返回值的方法
         * 判断一个数的奇偶
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i=scanner.nextInt();

        oddoreven(i);
    }
    public static void oddoreven(int a){
        if (a%2==0){
            System.out.println("这是个偶数");
        }else {
            System.out.println("这是一个奇数");
        }
    }
}
