package Circle;

public class Column extends Circle{
//    (1)成员变量：h（高）
    private double h;

//            (2)构造方法：2个参数，为半径和高赋初值

    public Column(double radius, double h) {
        super(radius);
        this.h = h;
    }

//            (3)存取h的get和set方法

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

//(4)public  double getArea()，返回表面积
public  double getArea(){
//        上下两个面的面积加侧面积
        return super.getArea()*2+super.getPerimeter()*h;
}
//            (5)public  double getVolume(),返回体积
public  double getVolume(){
        return super.getArea()*h;
}
//(6)public String toString()，返回圆柱的半径和高组成的字符串

    @Override
    public String toString() {
        return "圆柱的半径为：" +super.getRadius()+"高为："+h+"表面积为："+getArea()+"体积为："+getVolume();

    }


//            (7)public boolean equals(Object obj)，判断两个圆柱对象是否相等，如果两个圆柱的半径相同，高也相同，认为两个圆柱对象相等。
    @Override
    public boolean equals(Object obj){
    boolean flag=false;
    if(obj instanceof Column){
        Column column = (Column) obj;
        if(column.getRadius() == this.getRadius()&&column.getH()==this.getH()){
            flag=true;
        }
    }
    return flag;
}
}
