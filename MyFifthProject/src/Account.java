import java.util.Date;

public class Account {
//    成员变量：账户id，实名name、账户余额balance，开户日期dateCreated
    private String id;
    private String name;
    private double balance;
    private Date dateCreated;
    //    构造方法，为id、实名和dateCreated赋初值

    public Account(String id, String name, Date dataCreated) {
        this.id = id;
        this.name = name;
        this.dateCreated = dataCreated;
    }

//    get和set方法，此类中是否每个成员变量都需要get和Set方法？


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dataCreated) {
        this.dateCreated = dataCreated;
    }

    //    取款方法withdraw，从账户提取指定数额
    public void withdraw(double money){
        balance-=money;
    }
//    存款方法deposit，向账户存指定数额
    public void deposit(double money){
        balance+=money;
    }
//    转账方法transfer，向指定账户转指定数额
    public void transfer(Account arcAccount ,double money){
        arcAccount.balance+=money;
        balance-=money;
    }
//    public String toString()方法，返回“帐号：id\t实名：name\t账户余额:balance\t开户时间: dateCreated

    @Override
    public String toString() {
        return "账号" + id +
                ",姓名" + name +
                ", 余额" + balance +
                ", 日期" + dateCreated
                ;
    }
}
