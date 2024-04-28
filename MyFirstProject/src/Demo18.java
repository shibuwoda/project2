public class Demo18 {
    public static void main(String args []){
        /**
         * 无参无返回值的方法
         */
        chenfabiao();
    }
    public static void chenfabiao (){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");

            }
            System.out.println();
        }
    }
}
