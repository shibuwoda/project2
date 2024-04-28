import java.io.*;

public class Demo76 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"123.txt");
        FileOutputStream fos = new FileOutputStream(file);//输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);//缓存流
        String string="好饿";
        byte[] bytes = string.getBytes();
        bos.write(bytes);
//        bos.flush();//刷新
        bos.close();//关闭顺序不能乱
        fos.close();//文件之前有的会被覆盖
    }
}
