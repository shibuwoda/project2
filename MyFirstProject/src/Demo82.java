import java.io.*;
//字符流只能处理文本文件
//字节流可以处理文本，视频，图片
public class Demo82 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"456.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        String str="今天好热";
        char[] charArray = str.toCharArray();
        bw.write(charArray);
        bw.newLine();//换行书写
        bw.write("hh");
        bw.close();
        fw.close();

    }
}
