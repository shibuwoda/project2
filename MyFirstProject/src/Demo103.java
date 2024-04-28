import java.util.Arrays;
import java.util.Scanner;

public class Demo103 {
    private static int[] array;

    public static void main(String[] args){
        prise();

        index();

    }

    public static void prise() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入五个商品价格：");
//        int len = in.nextInt();
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("五个商品的价格分别是：" + Arrays.toString(array));
    }

    public static void index(){
//        int [] index =new int [3];
        System.out.println("第三个商品的价格是："+array[2]);
    }
}

