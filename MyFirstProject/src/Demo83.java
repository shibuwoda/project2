import java.io.*;

public class Demo83 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:"+File.separator+"JavaCode"+File.separator+"123.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        File file1 = new File("d:" + File.separator + "JavaCode" + File.separator + "123" + File.separator + "4567.txt");
        FileWriter fw = new FileWriter(file1);
        BufferedWriter bw = new BufferedWriter(fw);
        char[] cbuf = new char[4 * 1204];
        int length=-1;
        while ((length=br.read(cbuf))!=-1){
            bw.write(cbuf,0,length);
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();

    }
}
