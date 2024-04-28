import java.io.*;

public class Demo77 {
    public static void main(String[] args) throws IOException {
        copy();

    }
    public static void copy() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("d:" + File.separator + "JavaCode" + File.separator + "123.txt")));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("d:" + File.separator + "JavaCode" + File.separator + "456.txt")));
        byte[] bytes = new byte[4 * 1024];
        int length;
        while ((length=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,length);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
