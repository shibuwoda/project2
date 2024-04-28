class A {
    int x = 100;
    double y = 200.3;

    A(int x) {
        x = x;
    }

    A(double y) {
        this.y = y;
    }

    double B() {
        return x + y;
    }
}
public class Demo48{
    public static void main(String args []){
        A a1=new A(-80);
        System.out.println(a1.B());
        A a2=new A(60.5);
        System.out.println(a2.B());
    }
}