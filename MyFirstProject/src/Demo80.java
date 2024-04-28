import java.util.Arrays;
import java.util.Scanner;

public class Demo80 {
    public static void main(String[] args) {
        System.out.println("请输入单词：");
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String arr[]=new String[str.length()];
        for (int i=0;i<=str.length()-1;i++) {
            String a = str.substring(i, i + 1);
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
        int count=1;
        for (int j=0;j<=arr.length;j++) {
            for (int q=j+1;q<arr.length;q++){
                if (arr[j].equals(arr[q])) {
                count++;
                }
            }
        }
        System.out.println(count);


    }
}
