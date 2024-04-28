public class Demo53 {
    public static void main(String [] args){
        int a=3;
        int b=0;
        int result=0;
        try {
            result=a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
}
