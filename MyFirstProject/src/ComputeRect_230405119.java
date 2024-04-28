import java.util.Scanner;

/**
 * 计算矩形的周长
 */
public class ComputeRect_230405119 {
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.println("请输入矩形的长");
        double length=a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.println("请输入矩形的宽");
        double width=b.nextDouble();
        double c=length*2 + width*2;
        System.out.println("矩形的周长是："+c);
    }
}
