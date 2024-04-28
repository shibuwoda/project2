/**
 * 计算圆的面积
 */
import java.util.Scanner;
public class Demo25 {
    public static void main(String args []){
        Scanner a=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double b=a.nextDouble();
        area_of_a_circle (b);
    }
    public static void area_of_a_circle (double i){
        double area = i *i *3.14;
        System.out.println("圆的面积是："+area);
    }
}
