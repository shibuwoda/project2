enum Color{
    RED,GREEN,BLUE
}//枚举类
public class Demo85 {
    public static void main(String[] args) {
        Color[] values=Color.values();
        for (Color value:values){
            System.out.println(value+"的索引值是："+value.ordinal());
        }
    }
}
