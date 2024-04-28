public class TestCar {
    public static void main(String[] args) {
        Car c = new Car("保时捷",100,50);
        System.out.println("初始车速为："+c.speed);
        c.speedUp(100);
        System.out.println("加速后车速为："+c.speed);
        c.stop();
        System.out.println("停车后车速为："+c.speed);
    }
}
