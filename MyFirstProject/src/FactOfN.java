import java.util.Scanner;

public class FactOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������һ������n��С��20����");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0 || n >= 20) {
            System.out.println("������������Ϸ���������һ��С��20��������");
            return;
        }
        System.out.println(fact(n));

//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//       System.out.println(n + "! = " + factorial);

    }
    public static int fact(int n){
        int result;
        if (n!=1){
             result=n*fact(n-1);
        }else {
             result=1;
        }
    return result;
    }
}
