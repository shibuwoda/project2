package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) throws IOException {
//        试题格式为“题号\t题面\t选项A\t选项B\t选项C\t选项D\t正确答案”
//        编写程序依次读出每道试题的题面和选项，请用户作答，答对一题得5分，答不全得2分，答错得0分，输出每题用户的得分。
            test();
    }
    public static void test() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\aaa\\text3.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\t");
            Scanner scanner = new Scanner(System.in);
            System.out.println(data[0]+"\t"+data[1]);
            System.out.println(data[2]+data[3]+data[4]+data[5]);
            String answer = scanner.next().toUpperCase();
            if(answer.equals(data[6])){
                System.out.println("本题得分：5");
            }else if(contain(answer,data[6])){
                System.out.println("本题得分：2");
            }else {
                System.out.println("本题得分：0");
            }
        }
    }
//    判断用户输入的答案和标准答案是否是包含关系
    public static boolean contain(String a,String b){
        boolean flag = true;
        Boolean[] arr = new Boolean[a.length()];
        Arrays.fill(arr,false);
        for(int i = 0;i<a.length();i++){
            for (int j = 0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    arr[i]=true;
                    break;
                }
            }
        }
        for (Boolean aBoolean : arr) {
            if(!aBoolean){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
