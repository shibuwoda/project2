/**
 * 计算圆柱体的体积
 */
import java.util.Scanner;

public class Demo27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入圆柱的半径：");
        double radius = scanner.nextDouble();

        System.out.println("请输入圆柱的高：");
        double height = scanner.nextDouble();

        area_of_a_circle(radius, height);
    }

    public static void area_of_a_circle(double radius, double height) {
        double area = radius * radius * 3.14;
        double volume = area * height;

        System.out.println("圆柱体的体积是：" + volume);
    }
}
