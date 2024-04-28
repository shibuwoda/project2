import java.util.Scanner;
public class Demo63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一元二次方程的系数：");
        System.out.print("请输入 a 的值：");
        double a = scanner.nextDouble();
        System.out.print("请输入 b 的值：");
        double b = scanner.nextDouble();
        System.out.print("请输入 c 的值：");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("方程有两个不同的实根：");
            System.out.println("根 1 = " + root1);
            System.out.println("根 2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("方程有一个重根：");
            System.out.println("根 = " + root);
        } else {
            System.out.println("方程无实根");
        }
    }
}
 