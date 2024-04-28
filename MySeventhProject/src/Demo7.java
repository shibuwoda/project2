import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "黑马程序员";
        byte[] bytes = s.getBytes();
        byte[] bytes1 = s.getBytes("GBK");
        byte[] b1 = {-23, -69, -111, -23, -87, -84, -25, -88, -117, -27, -70, -113, -27, -111, -104};
        byte[] b2 ={-70, -38, -62, -19, -77, -52, -48, -14, -44, -79};
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes1));
        String s2 = new String(b1);
        System.out.println(s2);
        String s3 = new String(b2,"GBK");
        System.out.println(s3);


    }
}
