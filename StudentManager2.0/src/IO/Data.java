package IO;

import java.io.*;
import java.util.Scanner;

public class Data {
    private static final String FILE_NAME = "D:\\aaa\\account.dat";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
                        System.exit(0);
                        break;
                    default:
                        System.out.println("无效的选择，请重新输入！");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void registerUser(Scanner scanner) throws IOException {
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        if (isUserExist(userName)) {
            System.out.println("对不起，该用户名已被占用！");
        } else {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
                dos.writeUTF(userName);
                dos.writeUTF(password);
            }
            System.out.println("注册成功");
        }
    }

    private static boolean isUserExist(String userName) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    if (dis.readUTF().equals(userName)) {
                        return true;
                    }
                    dis.readUTF();
                } catch (EOFException e) {
                    break;
                }
            }
        }
        return false;
    }

    private static void loginUser(Scanner scanner) throws IOException {
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    String storedUserName = dis.readUTF();
                    String storedPassword = dis.readUTF();
                    if (userName.equals(storedUserName) && password.equals(storedPassword)) {
                        System.out.println("登录成功，欢迎你 " + userName);
                        return;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        }
        System.out.println("用户名或密码错误");
    }

    private static void viewUsers() throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    System.out.println(dis.readUTF() + "\t" + dis.readUTF());
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }
}