import java.util.Scanner;

public class Demo22 {
    public static void main(String args []){
        /**
         * 判断一个字母是否是大小写
         */
        Scanner t=new Scanner(System.in);
        System.out.println("请输入一个字母：");
        char j=t.next().charAt(0);
        String k=upper(j);
        System.out.println(k);
    }
    public static String upper(char i){
        if (i>='A'&&i<='Z'){
            return "是大写字母";

        }else {
            return "是小写字母";
        }
    }

}
