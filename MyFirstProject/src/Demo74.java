import java.io.File;

public class Demo74 {
    public static void main(String[] args) {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"MyThirdProject");

        del(file);
    }
    public static void del(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
            if (file1.isDirectory()) {
                del(file1);//是文件夹则继续进入
            } else {
                file1.delete();//是文件则删除
            }//利用递归层层进入
        }
    }

}
