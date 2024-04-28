public class Demo90 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=20;i++){
            count+=i;
            if (count>=100){
                break;
            }
        }
        System.out.println(count);
    }
}
