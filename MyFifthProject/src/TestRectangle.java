public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("矩形面积为："+rectangle.getArea());
        rectangle.move(2,3);
        System.out.println("移动后的坐标为："+"("+rectangle.origin.x+","+rectangle.origin.y+")");
    }
}
