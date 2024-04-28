public class Demo10 {
    public static void main(String args []){
        /**
         * 打印一到一百的数字如果带七则打过
         */
        for(int i=1;i<101;i++){
            if (i%7==0||i%10==7||i/10==7){
                System.out.println("过");
            } else{
                System.out.println(i);
            }
        }
    }
}
