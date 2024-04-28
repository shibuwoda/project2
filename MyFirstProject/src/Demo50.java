/**
 * 向上再向下转型
 */
class Person{
    public void feed(Object obj){
        Cat cat=(Cat)obj;
        cat.eat();
    }
}
class Cat{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
public class Demo50 {
    public static void main(String args []){
        Person person=new Person();
        person.feed(new Cat());
    }
}
