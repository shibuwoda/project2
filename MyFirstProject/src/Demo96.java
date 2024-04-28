public class Demo96 {
    public static void main(String[] args) {
        for (int i = 0; i <=4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

