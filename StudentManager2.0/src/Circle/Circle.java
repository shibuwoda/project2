package Circle;

public class Circle {
//    (1)成员变量：radius（半径）
    private double radius;
//            (2)构造方法：一个参数，为半径赋初值

    public Circle(double radius) {
        this.radius = radius;
    }

//            (3)存取radius的get和set方法

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

//(4)public double getArea()，返回面积
public double getArea(){
        return Math.PI*radius*radius;
}
//            (5)public double getPerimeter(),返回周长
public double getPerimeter(){
    return Math.PI*radius*2;
}

//(6)public boolean equals(Object obj)，判断两个圆对象是否相等，如果两个圆的半径相同，认为两个圆对象相等。


    @Override
    public boolean equals(Object obj){

        boolean flag=false;
        if(obj instanceof Circle){
            Circle circle = (Circle) obj;
            if(circle.radius == this.radius){
                flag=true;
            }
        }
        return flag;
}



}
