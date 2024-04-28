public class Rectangle {
    int width;
    int height;
    Point origin;
    Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
        this.origin=new Point(0,0);

    }
    void move(int x, int y) {
        origin =new Point(x,y);
    }
    int getArea() {
        return width*height;
    }



}
