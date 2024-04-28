import java.util.Scanner;

public class Season_230405119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int input = scanner.nextInt();

        String result = season(input);
        System.out.println(result);
    }

    public static String season(int input) {
        switch (input) {
            case 12:
            case 1:
            case 2:
                return "当前季节为冬季";
            case 3:
            case 4:
            case 5:
                return "当前季节为春季";
            case 6:
            case 7:
            case 8:
                return "当前季节为夏季";
            case 9:
            case 10:
            case 11:
                return "当前季节为秋季";
            default:
                return "输入的月份不合法";
        }
    }
}
