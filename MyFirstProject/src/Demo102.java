import java.util.Arrays;
import java.util.Scanner;
public class Demo102{
    public static void main(String[] args){
        prise();
    }
    public static void prise() {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("请输入五个商品价格：");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("五个商品的价格分别是：" + Arrays.toString(array));
        System.out.println("第三个商品的价格为："+array[2]);
    }

}

