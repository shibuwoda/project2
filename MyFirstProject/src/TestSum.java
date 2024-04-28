public class TestSum {
    public static void main(String[] args) {
        double sum=0 ;
        int  i =1;
        while (true){
            sum += 1.0/(i*i);
            if( (1.0/(i*i)) <= 1e-4 ){
                System.out.println(i);
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}
