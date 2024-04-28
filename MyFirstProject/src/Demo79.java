import java.util.Scanner;

public class Demo79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入密码：");
        String password1=in.nextLine();

        System.out.println("请再次输入密码：");
        String password2=in.nextLine();
        /**
         * 法一
         */
//        boolean flag = password1.equals(password2);
//        if (flag){
//            System.out.println("设置密码成功");
//        }else{
//            System.out.println("两次密码不一致！");
//
//        }
        int index = password1.compareTo(password2);
        if (index == 0){
            System.out.println("设置密码成功");
        }else{
            System.out.println("两次密码不一致！");
            System.out.println(index);
        }
    }
}
