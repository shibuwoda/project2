import java.util.Set;
import java.util.TreeSet;
class Students implements Comparable<Students>{
    String name;
    int age;
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return 0;
    }
}
public class Demo69 {
    public static void main(String[] args) {
        Students stu1 = new Students("老邢", 45);
        Students stu2 = new Students("老邢", 35);
        Students stu3 = new Students("saolei", 25);
        Students stu4 = new Students("老万", 87);
        //按照年龄进行排序 存到TreeSet集合中
        Set<Students> set = new TreeSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        System.out.println(set);

        //  Exception in thread "main" java.lang.ClassCastException:
        //  com.qfedu.c_treeSet.Student cannot be cast to java.lang.Comparable
        //	at java.util.TreeMap.compare(TreeMap.java:1294)
        //类转换异常的错误，Student转换不了Comparable
        //y因为底层在进行排序的时候，实现了Comparable这个接口
        //为啥泛型String没有报错  Integer也没有报错
    }
}



