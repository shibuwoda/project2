import java.util.Scanner;

public class Demo47 {
    public static void main(String args []){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int firstNumber=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int secondNumber=scanner.nextInt();
        System.out.println("请输入您的计算结果：");
        int result=scanner.nextInt();
        if(firstNumber+secondNumber==result){
            System.out.println("您的计算结果正确");
        }else{
            System.out.println("您的计算结果错误！");
        }

    }
}
