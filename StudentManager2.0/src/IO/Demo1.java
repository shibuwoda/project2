package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
//        写入
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\aaa\\test1.txt");
        fileOutputStream.write(("A001\t25\t100\n" +
                        "A002\t33\t130\n" +
                        "A003\t78\t35\n" +
                        "A004\t12.5\t200\n").getBytes());
        fileOutputStream.close();

 //      读取
        FileInputStream fileInputStream = new FileInputStream("D:\\aaa\\test1.txt");
        int b;
        StringBuilder stringBuilder = new StringBuilder();
        while ((b=fileInputStream.read())!=-1){
            stringBuilder.append((char)b);
        }
       fileInputStream.close();
        String[] arr = (stringBuilder.toString()).split("\n");
        double count=0;
        String[] arr2 ;
        for (int i = 0; i < arr.length; i++) {
             arr2 = arr[i].split("\t");
           count+=Double.parseDouble(arr2[1])*Double.parseDouble(arr2[2]);

        }
        System.out.println(count);
    }


}
