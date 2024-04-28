import java.util.Properties;

public class Demo86 {
    public static void main(String[] args) {
        String s = Integer.toString(79);
        System.out.println(s);//把所有类型转为字符串类型
        int i=Integer.parseInt("100");
        System.out.println(i);//把字符串转为基本型
        Properties properties = System.getProperties();
        System.out.println(properties.get("os.name"));//系统名
        System.out.println(properties.get("os.version"));//版本名
        System.out.println(properties.get("user.name"));//用户名
        System.out.println(properties.get("user.dir"));//文件地址
        System.out.println(properties.get("java.version"));//java的版本
    }
}
