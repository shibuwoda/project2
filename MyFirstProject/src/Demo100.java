import java.util.Scanner;

public class Demo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] prices = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入商品 " + (i + 1) + " 的价格：");
            prices[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("第3个商品的价格是： " + prices[2]);
    }
}