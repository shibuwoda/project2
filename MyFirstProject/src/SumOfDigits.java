import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();

        int sum = 0;  // 用于保存各位数字之和的变量

        while (n != 0) {
            sum += n % 10;  // 取出n的最后一位数字并加到sum上
            n /= 10;  // 去掉n的最后一位数字
        }

        System.out.println("各位数字之和为: " + sum);
    }
}