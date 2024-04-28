public class Demo16 {
    public static void main(String args []){
        /**
         * 打印一个倒三角
         */
        for (int i=5 ;i>0;i--){
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
