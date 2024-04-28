import java.io.*;
/**
 * 字符输入流
 */
public class Demo81 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"123.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        //char[] cbuf = new char[4];
//        int length=-1;
//        while ((length=br.read())!=-1){
//            System.out.println(length);
//           // String string = new String(cbuf, 0, length);
//            //System.out.println(string);
//        }
//        String string = br.readLine();
//        System.out.println(string);//读取一行
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        fr.close();

    }
}
