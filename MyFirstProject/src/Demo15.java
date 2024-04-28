public class Demo15 {
    public static void main(String args []){
        /**
         * 用for循环打印一个等腰三角形
         */
        for (int i=1;i<5;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }System.out.println( );


        }
    }
}
