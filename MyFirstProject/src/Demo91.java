public class Demo91 {

    public static void main(String[] args) {
        // 外层循环控制行数
        for (int i = 1; i <= 9; i++) {
            // 内层循环控制列数
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                // 输出格式化的乘法表元素
                System.out.print(i + " x " + j + " = " + result + "\t");
            }
            // 换行
            System.out.println();
        }
    }
}
