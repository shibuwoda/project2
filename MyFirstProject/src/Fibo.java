import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2 ; i<arr.length;i++){
           arr[i] =arr[i-2] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

    }


}
