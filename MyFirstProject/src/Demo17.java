public class Demo17 {
    public static void main(String args []){
        /**
         * 打印一个倒立的直角三角形
         */
        for (int i=5;i>0;i--){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=6-i;k++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
