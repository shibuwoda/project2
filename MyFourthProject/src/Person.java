public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name){
        this.name=name;
    }
    public void speak(){
        System.out.println("大家好，我叫"+name+"今年"+age+"岁了");
    }


}
