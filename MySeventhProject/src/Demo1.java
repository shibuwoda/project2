import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test1.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);

    }
}
