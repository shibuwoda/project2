/**
 * 抛出异常
 */
public class Demo54 {
    public static void main(String []args){
        test(0);
    }
    public static void test(int a){
        if(a==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println(1);
    }
}
