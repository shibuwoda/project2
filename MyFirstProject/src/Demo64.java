import java.util.Scanner;

public class Demo64 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数（1-13）：");
        int userInput= input.nextInt();
        switch (userInput){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("用户拿到的牌是："+userInput);
                break;
            case 11:
                System.out.println("用户拿到的牌是：J");
                break;
            case 12:
                System.out.println("用户拿到的牌是：Q");
                break;
            case 13:
                System.out.println("用户拿到的牌是：K");
                break;
            default:
                System.out.println("输入有误！");
        }
    }
}
