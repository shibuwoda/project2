import java.util.Scanner;
public class Demo99 {
    public static void main(String[] args) {
        judge();
    }
    public static double Avg(double score1, double score2) {
        return (score1 + score2) / 2.0;
    }
    public static void judge(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一门课程的成绩:");
        double score1 = scanner.nextDouble();

        System.out.println("请输入第二门课程的成绩:");
        double score2 = scanner.nextDouble();

        double average = Avg(score1, score2);

        if ((score1>100||score1<0)||(score2>100||score2<0)){
            System.out.println("您输入的成绩不合规请检查后再次输入！");
            judge();

        }else  System.out.println("两门课程的平均分是: " + average);

    }
}