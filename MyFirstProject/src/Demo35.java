import java.util.Arrays;

/**
 * 指定元素批量替换
 */
public class Demo35 {
    public static void main(String args[]) {
        int arr[]={1,2,3,1,2,1,4,1};
        System.out.println(Arrays.toString(replace(arr,250)));

    }
    public static int[] replace(int arr[],int find){
        for (int i =0;i< arr.length;i++){
            if (arr[i]==1){
                arr[i]=find;
            }
        }
        return arr;
    }
}