import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo55 {
    public static void main(String[] args) {
        System.out.println( "2");
        ArrayList list=new ArrayList();
        list.add('a');
        list.add("狗蛋");
        list.add(3);
        String string=(String)list.get(1);
        System.out.println(string);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        ArrayList<String> list1 = new ArrayList<>();//限制下面加入集合的数据类型
        list1.add("狗蛋儿");
        System.out.println(list1.get(0));

    }
}
