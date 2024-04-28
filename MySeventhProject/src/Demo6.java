import java.io.*;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aaa\\test4.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\aaa\\text5.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len= bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
