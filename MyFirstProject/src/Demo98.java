import java.util.Random;

public class Demo98 {
    public static void main(String[] args) {
        int[] arr = {28, 68, 98, 648, 888};
        int[] newarr = new int[5];
        Random ra = new Random();
        for (int i = 0; i < arr.length; ) {
            int raindex = ra.nextInt(arr.length);//随机下标
            newarr[i] = arr[raindex];//新数组加入元素
            if (hh( newarr ,arr[raindex])) {
                System.out.println(arr[raindex]);
                i++;
            }
        }
    }

    public static boolean hh(int[] arr, int price) {
        //arr新数组
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (price == arr[i]) {
                flag = false;
            } else if (price != arr[i]) {
                arr[i] = price;
                flag = true;
                break;
            }
        }
        return flag;
    }
}
