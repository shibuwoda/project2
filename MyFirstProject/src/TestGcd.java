import java.util.Scanner;

public class TestGcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个正整数：");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("最大公约数是：" + gcd);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}