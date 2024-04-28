class Monkey{
    public String xixi(Object obj){
        if (obj instanceof String){
            String string=(String)obj;
            return "您输入的是字符串";
        }else{
            return"不是字符串";
        }

    }
}
public class Demo52 {
    public static void main(String args []){
        Monkey monkey=new Monkey();
        System.out.println(monkey.xixi("狗蛋"));
    }
}
