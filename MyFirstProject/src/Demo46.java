import java.util.Scanner;
public class Demo46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年利率:");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("请输入贷款额度:");
        double loanAmount = scanner.nextDouble();
        System.out.println("请输入还款月数:");
        int numberOfMonths = scanner.nextInt();
        double monthlyInterestRate = annualInterestRate / 12 ;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfMonths));
        double totalPayment = monthlyPayment * numberOfMonths;
        System.out.println("总还款额度为: " + totalPayment);
        System.out.println("每个月需要还: " + monthlyPayment);
    }
}