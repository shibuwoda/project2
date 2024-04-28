interface B<T>{
    void eat(T t);
}
public class Demo59 {
    public static void main(String[] args) {
        B<Object> objectB = new B<Object>() {
            @Override
            public void eat(Object o) {
                System.out.println(o);
            }
        };
        objectB.eat(2);
    }
}
