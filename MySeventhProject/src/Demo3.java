import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
//        文件复制的写法
        FileInputStream fis = new FileInputStream("D:\\aaa\\test4.txt");
        FileOutputStream fos = new FileOutputStream("D:\\aaa\\test5.txt",true);
        int b;
        while ((b= fis.read())!=-1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
