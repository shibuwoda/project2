import java.util.Scanner;

public class TestGcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ����������");
        int num1 = scanner.nextInt();
        System.out.println("������ڶ�����������");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("���Լ���ǣ�" + gcd);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}