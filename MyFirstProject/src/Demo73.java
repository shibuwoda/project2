import java.io.File;
import java.io.IOException;

public class Demo73 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"1");
        System.out.println(file.createNewFile());//新建文件，抛错
        File file1 = new File("d:"+File.separator+"JavaCode"+File.separator+"MyThirdProject");
        System.out.println(file1.mkdir());
    }
}
