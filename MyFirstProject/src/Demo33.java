/**
 * 在数组中寻找指定元素第一次出现的下标
 */
public class Demo33 {
    public static void main(String args []){
        int arr[]=new int[]{1,2,3,4,5};
        int find=3;
        System.out.println(indexOfArr(arr,find));
    }
    public static int indexOfArr(int[] arr,int find){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if (find==arr[i]){
                index=i;
            }
        }
        return index;
    }
}
