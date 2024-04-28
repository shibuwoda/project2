/**
 * bmi的计算
 */

import java.util.Scanner;
public class Demo28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入您的身高（单位：米）：");
        double height = input.nextDouble();

        System.out.print("请输入您的体重（单位：千克）：");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("您的BMI值为：" + bmi);

        if (bmi < 18.5) {
            System.out.println("您的BMI值属于过轻范围，需要增加体重。");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("您的BMI值属于正常范围，无需调整体重。");
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("您的BMI值属于超重范围，需要减轻体重。");
        } else {
            System.out.println("您的BMI值属于肥胖范围，必须减轻体重。");
        }
    }
}