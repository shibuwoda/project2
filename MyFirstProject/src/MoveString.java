import java.util.Scanner;

public class MoveString {
    public static void main(String[] args) {
        // �����ַ���
        System.out.println("������һ���ַ�����");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // ��ʼ���µ��ַ���Ϊ��
        StringBuilder newStr = new StringBuilder();

        // ��ԭʼ�ַ�����ÿһ���ַ��ŵ��µ��ַ������Ҳ࣬�γ�����һλ��Ч��
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr.append(input.charAt(i));
        }

        // ����µ��ַ���
        System.out.println("����һλ����ַ����ǣ�" + newStr.toString());
    }
}