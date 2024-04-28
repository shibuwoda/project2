class Animals<T>{
    public void play(T t){
        System.out.println(t);
    }

}
class Monkey2<T> extends Animals<T>{
    @Override
    public void play(T t) {
        System.out.println(t);
    }
}
public class Demo57 {
    public static void main(String[] args) {
        Animals<Object> animals = new Animals<>();
        animals.play("Basketball");
        Monkey2<String> monkey=new Monkey2<>();//限制泛形
        monkey.play("篮球");


    }
}
