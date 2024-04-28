package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的型号");
        String model = scanner.nextLine(); // 用户指定型号
        int totalSales = getTotalSalesForModel(model);
        System.out.println("型号"+model+"的销售总额: " + totalSales);
    }
    public static int getTotalSalesForModel(String model) throws IOException {
//        销售额
        int totalSales = 0;
        BufferedReader reader = new BufferedReader(new FileReader("D:\\aaa\\test2.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\t");
//               遍历符合的型号
            if (model.equals(data[0])) {
                int sales = Integer.parseInt(data[1]);
                totalSales += sales;
            }
        }
        return totalSales;
    }
}
