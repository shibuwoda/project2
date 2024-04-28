class Dog{
    private String name;



    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Demo42 {
    public static void main(String args []){
        Dog dog =new Dog();
        dog.setName("旺财");
        System.out.println(dog.getName());
    }
}
