import java.util.Arrays;

/**
 * 数组逆序
 */
public class Demo31 {
    public static void main(String args []){
        int []arr=reverse();
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverse (){
        int arr[]={1,2,3,4};//定义原数组
        int arr1[]=new int[arr.length];//定义空数组来接受数组
        for(int i=0,j=arr.length-1;i< arr.length;i++,j--) {
            arr1[j] = arr[i];
        }
        return arr1;
    }
}
