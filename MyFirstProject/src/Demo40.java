import java.util.Arrays;
/**
 * 冒泡排序
 */
public class Demo40 {
    public static void main(String args []){
        int arr[]={1,2,4,5,7,3,6,9};
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
