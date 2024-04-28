import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
//        抛错写法
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\aaa\\test4.txt",true);
            fos.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
