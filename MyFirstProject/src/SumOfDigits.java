import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ��������");
        int n = scanner.nextInt();

        int sum = 0;  // ���ڱ����λ����֮�͵ı���

        while (n != 0) {
            sum += n % 10;  // ȡ��n�����һλ���ֲ��ӵ�sum��
            n /= 10;  // ȥ��n�����һλ����
        }

        System.out.println("��λ����֮��Ϊ: " + sum);
    }
}