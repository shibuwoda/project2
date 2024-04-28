public class SumOfNumbers {
    public static void main(String[] args) {
        int result = 0;
        for(int i =100;i<=300;i++){
            if((i%7==0)||(i%3==0)){
            result +=i;
            }
        }
        System.out.println(result);
    }
}
