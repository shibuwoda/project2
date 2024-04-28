import java.io.*;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aaa\\test4.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\aaa\\text5.txt",true));
        int b = 0;
        while ((b= bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();

    }
}
