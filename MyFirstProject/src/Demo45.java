class Tiger{
     String name;
     int age;
    public Tiger(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Tiger(){
        this("狗剩",12);
        System.out.println(this);
    }


}
public class Demo45 {
    public static void main(String args []){
        Tiger tiger=new Tiger();
        System.out.println(tiger.name);
        System.out.println(tiger.age);
    }
}
