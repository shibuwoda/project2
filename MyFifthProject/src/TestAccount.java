import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("19","蒋",new Date());
        a1.deposit(3000);
        System.out.println("存钱后当前余额为"+a1.getBalance());
        a1.withdraw(2500);
        System.out.println("取钱后当前余额为"+a1.getBalance());
        Account a2 = new Account("21","徐",new Date());
        a1.transfer(a2,200);
        System.out.println("转钱后当前余额为"+a1.getBalance());
        System.out.println(a1);
        System.out.println(a2);
    }
}
