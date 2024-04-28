public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        System.out.println("p1的坐标为："+"("+p1.x+","+p1.y+")");
        Point p2 = new Point(5,-1);
        System.out.println("p2的坐标为："+"("+p2.x+","+p2.y+")");
        p2.remove(0,0);
        System.out.println("p2移动后的坐标为："+"("+p2.x+","+p2.y+")");
    }
}
