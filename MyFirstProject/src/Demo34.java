import java.util.Arrays;
/**
 * 显示出一个数组同一元素的下标数组
 */
public class Demo34 {
    public static void main(String args []){
        int arr[]={1,2,3,1,5,1,7,1};
        int fond=1;
        int a[]=allOfArrIndex(arr,fond);
        System.out.println(Arrays.toString(a));
    }
    public static int[] allOfArrIndex(int []arr,int fond){
        int []arr1=new int[arr.length];//接受数组
        for (int i=0;i< arr.length;i++){
            arr1[i]=-1;
        }//接受数组全部赋值为-1
        int count=0;//计数器
        for (int i=0;i< arr1.length;i++){
            if (arr[i]==fond){
                arr1[count++]=i;
            }
        }
        int newArr[]=new int[count];
        for (int i=0;i<count;i++){
            newArr[i]=arr1[i];
        }
        return newArr;
    }
}
