public class PrintNumbers {
    public static void main(String[] args) {
        int count= 0;
        for (int i = 100;i<=300;i++){
            if((i%5!=0)&&(i%7!=0)){
                count++;
                System.out.print(i +"\t");
                if(count%10==0){
                    System.out.println();
                }
            }
        }
    }
}
