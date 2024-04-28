import java.util.Arrays;
/**
 * 数组中最大值与第一项交换位置
 */
public class Demo38 {
    public static void main(String args []){
        int arr[]={1,1,2,9,8,7,5,6,2,1};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int arr[]){
        int maxIndex=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[0];
        arr[0]=temp;

    }
}
