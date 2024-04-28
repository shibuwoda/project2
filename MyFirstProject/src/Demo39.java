import java.util.Arrays;
/**
 * 选择排序
 */
public class Demo39 {
    public static void main(String args []){
        int arr[]={3,4,5,1,2,9,8,6,7};
        for (int i=0;i< arr.length-1;i++){
            int minIndex=i;
            for(int j=i;j< arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
