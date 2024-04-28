import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int sum=this.age-o.age;
        return sum;
    }
    public static void eat(){
        System.out.println("123");
    }
}
public class Demo70 {
    public static void main(String[] args) {
        Student student1 = new Student("123", 4);
        Student student2 = new Student("123", 5);
        Student student3 = new Student("123", 1);
        Set<Student> set=new TreeSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        System.out.println(set);
        Student.eat();



    }
}