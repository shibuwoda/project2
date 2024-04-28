import sun.awt.image.OffScreenImageSource;

import java.io.*;

public class Demo75 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"123.txt");
        FileInputStream fis = new FileInputStream(file);//输入流
        BufferedInputStream bis = new BufferedInputStream(fis);//缓存流
        byte[] buf = new byte[2];//存入的数组以及缓存流的大小
//        int read=bis.read(buf);//读取数组的长度
//        System.out.println(read);
//        System.out.println(new String(buf,0,read));//打印存入数组的内容
        int length=-1;//可以不赋值
        while ((length= bis.read(buf))!=-1){
            System.out.println("123");
            System.out.println(new String(buf,0,length));
        }
        bis.close();
        fis.close();//不关闭会消耗内存

    }
}
