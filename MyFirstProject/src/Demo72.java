import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class Boy{
    int age;
    String name;

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}
public class Demo72 {
    public static void main(String[] args) {
        Map<Integer,Boy>map=new HashMap<>();
        map.put(1,new Boy(26,"张三"));
        map.put(2,new Boy(23,"李四"));
        map.put(3,new Boy(24,"王五"));
        map.put(4,new Boy(22,"老六"));
        map.put(6,new Boy(26,"小八"));
        System.out.println(map);
        Set<Integer> keyed = map.keySet();
        System.out.println(keyed);//键
        Collection<Boy> values = map.values();
        System.out.println(values);//值
        for (Boy value : values) {
            System.out.println(value.name);
        }//iter遍历打印出所有名字属性
        Set<Map.Entry<Integer, Boy>> entries = map.entrySet();
        for (Map.Entry<Integer, Boy> entry : entries) {
            System.out.println(entry.getValue().name);
        }
        List<Boy> list = new ArrayList<>();
        list.add(new Boy(26,"小七"));
        list.add(new Boy(24,"小八"));
        Map<String,List<Boy>>map1=new HashMap<>();
        map1.put("001",list);
        System.out.println(map1);



    }
}
