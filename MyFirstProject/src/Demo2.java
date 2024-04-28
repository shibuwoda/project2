public class Demo2 {
    public static void main(String[] args) {
        double area1 = computerCircleArea(3 );
        System.out.println("圆的面积是"+area1);

    }

    public static double computerCircleArea(double r) {
        double area = 3.14 * r * r;
        return area;
    }
}