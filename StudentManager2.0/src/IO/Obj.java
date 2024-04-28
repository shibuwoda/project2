package IO;

import java.io.*;
import java.util.Scanner;

public class Obj {
        private static final String FILE_NAME = "D:\\aaa\\account4.dat";

        public static void main(String[] args) throws IOException, ClassNotFoundException {
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

        private static void registerUser(Scanner scanner) throws IOException, ClassNotFoundException {
            System.out.print("请输入用户名：");
            String userName = scanner.next();
            System.out.print("请输入密码：");
            String password = scanner.next();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME,true));
            if (isUserExist(userName)) {
                System.out.println("对不起，该用户名已被占用！");
            } else {
                User obj = new User(userName,password);
                oos.writeObject(obj);
                System.out.println("注册成功");
            }
            oos.flush();
            oos.close();

        }
        private static boolean isUserExist(String userName) throws IOException, ClassNotFoundException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            boolean flag = false;
                while (true){
                    try {
                        User o = (User) ois.readObject();
                        if(o.getUserName().equals(userName)){
                            flag = true;
                        }
                    } catch (EOFException e) {
                        break;
                    }
                }
            ois.close();
            return flag; // 如果循环结束都没有找到，则返回false
        }
        private static void loginUser(Scanner scanner) throws IOException, ClassNotFoundException {
            System.out.print("请输入用户名：");
            String userName = scanner.next();
            System.out.print("请输入密码：");
            String password = scanner.next();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            while (true){
                try {
                    User o = (User) ois.readObject();
                    if(o.getUserName().equals(userName)&&o.getPassword().equals(password)){
                        System.out.println("登录成功，欢迎你 " + userName);
                        return;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            ois.close();
            System.out.println("用户名或密码错误");
        }
        private static void viewUsers() throws IOException, ClassNotFoundException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            while (true){
                try {
                    User o = (User) ois.readObject();
                    System.out.println(o.getUserName()+" "+o.getPassword());
                } catch (EOFException e) {
                    break;
                }
            }
            ois.close();
        }
}
