import java.util.Random;
import java.util.stream.IntStream;

public class Demo78 {
    public static void main(String[] args) {
        int x=-9;
        int y=16;
        int a=2;
        System.out.println(Math.abs(x));//绝对值
        System.out.println(Math.max(x,y));//最大值
        System.out.println(Math.pow(a,4));//a的四次幂
        Random random = new Random();
        int i = random.nextInt(47);
        System.out.println(i);
        char b='a';//小写97 大写65
        System.out.printf("%c",b);
        String name = "A";
        int age = 1;
        String c = String.format(" %s  %d ", name, age);
        System.out.println(c);
        int d=b+age;
        System.out.println(d);
        String str ="123456";
        System.out.println(str.substring(0,6));//0-6
        System.out.println(str.charAt(str.length()-1));
        for (int j=0;j<str.length();j++){
            System.out.print(str.charAt(str.length()-1-j));
        }


    }
}
