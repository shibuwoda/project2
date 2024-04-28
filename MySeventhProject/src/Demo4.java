import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
//        利用小数组来辅助拷贝
        FileInputStream fis = new FileInputStream("D:\\aaa\\test4.txt");
        FileOutputStream fos = new FileOutputStream("D:\\aaa\\test5.txt",true);
        byte[] bytes = new byte[1024];
        int len;
        while ((len= fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
