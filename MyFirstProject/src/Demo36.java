import java.util.Arrays;

/**
 * 抽出数组元素自动填补末尾变零
 */
public class Demo36 {
    public static void main(String args []){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i=2;i< arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));
    }

}
