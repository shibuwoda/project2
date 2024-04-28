import java.util.Scanner;
public class Demo62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = in.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = in.nextInt();
        if (num2 > num1) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        System.out.println("请输入计算结果");
        int result = in.nextInt();
        if (num1 - num2 == result) {
            System.out.println("您计算的结果正确");
        }else{
            System.out.println("您计算的结果有误，正确答案应该是："+(num1 - num2));
        }
    }
}
