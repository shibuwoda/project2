import java.util.Arrays;
/**
 * 数组后撤插入指定数字
 */
public class Demo37 {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,0};
        for (int i= arr.length-1;i>2;i--) {
        arr[i]= arr[i-1];
        }
        arr[2]=0;
        System.out.println(Arrays.toString(arr));
    }
}
