package Colunm;

public class Column implements Comparable<Column>{
    private int radius;
    private int h;

    public Column(int radius, int h) {
        this.radius = radius;
        this.h = h;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Column{" +
                "radius=" + radius +
                ", h=" + h +
                '}';
    }

    @Override
    public int compareTo(Column o) {
        int result = this.radius - o.radius;
        result = result==0?(this.h - o.h):result;
        return result;
    }

//    圆柱类Column
//            (6)实现Comparable接口
//(7)成员变量：radius（半径，int型），h（高，int型）
//            (8)构造方法：2个参数，为半径和高赋初值
//            (9)toString方法，返回半径和高拼接成的字符串
//            (10)CompareTo方法，比较规则为：从先按radius比较，相同半径的情况下比较h。
}
