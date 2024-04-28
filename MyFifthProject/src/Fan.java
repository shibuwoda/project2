public class Fan {
//    (1) 成员变量:int 类型的 speed,boolean 类型的 on(开关状态)，double 类型的 radius
//    String 类型的 color
//    三个 public 的静态常量均为 int 型，SLOW 代表慢速，值为 1; MEDIUM 代表中速
    private int speed;
    private boolean on;
    private double radius;
    private  String color;
    public static  int x,y,z;
    public void methoed(double radius,String color){
        this.radius=radius;
        this.color=color;
        this.on=false;
    }


//2)
//    值为 2,FAST 代表快速，值为 3
//    构造方法:两个参数，分别为半径和颜色赋初值，电扇初始化时为关闭状态
//3)
//        (4) 成员变量的 get和 set 方法
//            (5) public tring toString0方法: 如果电扇是开的，返回“速度、半径、颜色组合而成的
//    字符串”，如果电扇是关的，返回“fan is off!"
}
