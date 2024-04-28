public class Car {
    private String name;
    private double price;
     double speed;
    public Car(String name,double price,double speed){
        this.name=name;
        this.price=price;
        this.speed=speed;

    }
    public void speedUp(int a){
        speed=a;
    }
    public void stop(){
        speed=0;
    }


}
