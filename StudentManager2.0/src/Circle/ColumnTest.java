package Circle;

public class ColumnTest {
    public static void main(String[] args) {
        Column column = new Column(5, 6);
        Column column2 = new Column(5, 5);
        System.out.println(column.toString());//圆柱的半径为：5.0高为：6.0
        System.out.println(column.equals(column2));//false
        Circle circle = new Circle(6);
        Circle circle2 = new Circle(6);
        System.out.println(circle.equals(circle2));//true
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(7);
        System.out.println(circle3.equals(circle4));//false

    }
}
