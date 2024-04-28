import java.util.Arrays;
import java.util.Scanner;

public class Demo30 {
    /**
     * 自定义数组
     * @param args
     */
    public static void main(String [] args){
        int arr[]=new int[5];//定义一个有五个元素的数组
        addarr(arr);//调用自定义数组方法
        System.out.println(Arrays.toString(arr));//打印数组
    }
    public static void addarr(int [] arr){
        /**
         * 数组方法的定义格式
         */
        Scanner a=new Scanner(System.in);
        for(int i=0;i< arr.length;i++) {
            System.out.println("请输入数组的第" + (i + 1) + "的值");
            int i1=a.nextInt();
            arr[i]=i1;
        }
    }
}
