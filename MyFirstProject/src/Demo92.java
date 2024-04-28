import java.util.Scanner;

public class Demo92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();

        String result = method(input);

        System.out.println("处理后的字符串：" + result);
    }

    public static String method(String input) {
        if (input.isEmpty()) {
            return input;
        }

        char lastChar = input.charAt(input.length() - 1);

        return lastChar + input.substring(0, input.length() - 1);
    }
}
