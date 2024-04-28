import java.util.Random;

public class Demo105 {
    public static void main(String[] args) {
        // 生成随机字母
        char[] RandomChar =new char[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            char c = (char) (random.nextInt(26) + 'A');
            RandomChar[i]=c;
        }

        // 统计字母个数
        int[] counts = new int[26];
        for (int i=0;i<100;i++) {
            char c=RandomChar[i];
            counts[c - 'A']++;

        }

        // 打印字母及其个数
        for (char c = 'A'; c <= 'Z'; c++) {
            if (counts[c - 'A'] > 0) {
                System.out.println(c + ": " + counts[c - 'A']);
            }
        }
    }
}