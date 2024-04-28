/**
 * 泛形中大T不具有普遍性
 * @param <T>
 */
class Dog2<T>{
    public <T> void eat(T t){
        System.out.println(t);
    }
    public void play(T t){
        System.out.println(t);
    }
}
public class Demo56 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat(1);
        dog.play("123");
    }
}
