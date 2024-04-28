import java.util.Scanner;

public class Demo6 {
    public static void main (String agrs []){
        Scanner a= new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int b =a.nextInt();
        if (b>0){
            System.out.println("您输入的数为正数");
        } else if (b<0) {
            System.out.println("您输入的数为正负数");
        } else {
            System.out.println("您输入的数为零");
        }

    }
}
