package IO;

import java.io.*;
import java.util.Scanner;

public class Buffer {
    private static final String FILE_NAME = "D:\\aaa\\account.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择操作：1.注册 2.登录 3.查看用户信息 4.退出");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    viewUsers();
                    break;
                case 4:
                    System.out.println("感谢使用，再见！");
                    return;
                default:
                    System.out.println("无效的选择，请重新输入！");
            }
        }
    }

    private static void registerUser(Scanner scanner) throws IOException {
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();

        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            if (isUserExist(userName)) {
                System.out.println("对不起，该用户名已被占用！");
            } else {
                writer.write(userName+"\t"+password);
                writer.newLine();//换行
                System.out.println("注册成功");
            }
            writer.close();

    }
    private static boolean isUserExist(String userName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t"); // 用户名和密码之间用制表符分隔
                if (userName.equals(parts[0])) {
                    return true;
                }
            }
        }
        return false; // 如果循环结束都没有找到，则返回false
    }
    private static void loginUser(Scanner scanner) throws IOException {
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();

        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split("\t");
                if (userName.equals(userDetails[0]) && password.equals(userDetails[1])) {
                    System.out.println("登录成功，欢迎你" + userName);
                    return;
                }
            }
            System.out.println("用户名或密码错误");
    }
    private static void viewUsers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
    }
}

