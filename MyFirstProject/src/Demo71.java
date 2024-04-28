import java.util.*;

public class Demo71 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("001","x");
        map.put("002","y");
        System.out.println(map);//{001=x, 002=y}键值对
        /**
         * 不同于Treeset的先来者居上，键值对是覆盖
         * 无序
         */
        Map<String,String> map2=new HashMap<>();
        map2.put("003","x");
        map2.put("004","y");
        map.putAll(map2);//可以增
        System.out.println(map);
        System.out.println(map.remove("003"));//删
        System.out.println(map);
        map.put("004","z");//修改方法是覆盖
        System.out.println(map);
        System.out.println(map.size());//3
        System.out.println(map.isEmpty());//是否为空
        System.out.println(map.containsKey("004"));//是否有键
        System.out.println(map.containsValue("x"));//是否有值
        Set<String> strings = map.keySet();//键的转移
        System.out.println(strings);
        Collection<String> values=map.values();//值的转移
        System.out.println(values);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);//[001=x, 002=y, 004=z]整体转移
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }//iter快捷键逐一取出


    }
}
