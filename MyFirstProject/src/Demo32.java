import java.util.Arrays;
import java.util.Scanner;

/**
 * 自定义数组的逆序
 */

public class Demo32 {
    public static void main(String args []){
        int arr[]=reverse();
        System.out.println(Arrays.toString(arr));
    }
    public static int[] addarr(){
        Scanner a=new Scanner(System.in);
        System.out.println("请输入自定义数组的元素个数：");
        int x=a.nextInt();
        int arr[]=new int[x];//定义一个有x个元素的数组
        Scanner b=new Scanner(System.in);
        for(int i=0;i< arr.length;i++) {
            System.out.println("请输入数组的第" + (i + 1) + "的值");
            int i1=b.nextInt();
            arr[i]=i1;
        }
        return arr;
    }
    public static int[] reverse (){
        int arr[]=addarr();//定义原数组
        int arr1[]=new int[arr.length];//定义空数组来接受数组
        for(int i=0,j=arr.length-1;i< arr.length;i++,j--) {
            arr1[j] = arr[i];
        }
        return arr1;

    }
}