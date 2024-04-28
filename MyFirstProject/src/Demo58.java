abstract class A2<T>{
    abstract void test(T t);
}
class Test<T> extends A2<T>{

    @Override
    void test(T t) {
        System.out.println(t);
    }
}
public class Demo58 {
    public static void main(String[] args) {
        Test<Object> Test1 = new Test<>();
        Test1.test(1);
    }
}
