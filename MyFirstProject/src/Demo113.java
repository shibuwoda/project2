import java.util.Scanner;

public class Demo113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt() ;
        switch (week){
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println('2');
                break;
            case 3:
                System.out.println('3');
                break;
            default:
                System.out.println('0');
        }
    }
}
