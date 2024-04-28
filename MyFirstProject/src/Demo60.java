/**
 * 判断两数中的最大
 */
import java.util.Scanner;
public class Demo60 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1=in.nextInt();
        System.out.println("请输入第二个整数：");
        int num2= in.nextInt();
        int max=num1;
        if (num1<num2){
         max=num2;
        }
        System.out.println(num1+"和"+num2+"中"+max+"最大");
    }
}
