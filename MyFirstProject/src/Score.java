import java.util.Scanner;

public class Score {
    public static void main (String args []){
        Scanner a = new Scanner (System.in );

        int score = a.nextInt() ;

        if ( score>100 || score<0){
            System.out.println("您输入的成绩有误");
            System.exit(0);
        } else if (score <= 100 && score >=90 ){
            System.out.println("优秀");
        } else if ( score >=60) {
            System.out.println("良好");
        } else if ( score < 60 ) {
            System.out.println("不及格");
        }
    }

}
