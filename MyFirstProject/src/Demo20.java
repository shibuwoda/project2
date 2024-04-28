public class Demo20 {
    public static void main(String args []){
        /**
         * 有参有返回值的方法
         */
        System.out.println(judge(71.4,81.2));
    }
    public static boolean judge(double a,double b){
        if (a>b){
           return true;
        }else {
            return false;
        }
    }
}
