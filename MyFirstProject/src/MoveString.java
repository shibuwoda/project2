import java.util.Scanner;

public class MoveString {
    public static void main(String[] args) {
        // 输入字符串
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 初始化新的字符串为空
        StringBuilder newStr = new StringBuilder();

        // 将原始字符串的每一个字符放到新的字符串的右侧，形成右移一位的效果
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr.append(input.charAt(i));
        }

        // 输出新的字符串
        System.out.println("右移一位后的字符串是：" + newStr.toString());
    }
}