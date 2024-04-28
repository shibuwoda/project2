import java.util.Scanner;
public class Demo61 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1=in.nextInt();
        Scanner in2=new Scanner(System.in);
        System.out.println("请输入第二个数：");
        int num2=in.nextInt();
        Scanner in3=new Scanner(System.in);
        System.out.println("请输入第三个数：");
        int num3=in.nextInt();
        int max=num1;
        if (num2>num1&&num3<num2){
            max=num2;
        } else if (max<num3) {
            max=num3;
        }
        System.out.println("最大数为"+max);
    }
}
