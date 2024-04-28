package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private static Scanner sc;
    private static final ArrayList<Student> list = new ArrayList<>();

    public StudentManager() {
        sc = new Scanner(System.in);
    }


    private void showMenu(){
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1 添加学生");
        System.out.println("2 删除学生");
        System.out.println("3 修改学生");
        System.out.println("4 查看学生");
        System.out.println("5 退出");
        System.out.println("请输入您的选择:");
    }
//    加入测试数据
    static {
        list.add(new Student("001","张三",95));
        list.add(new Student("002","李四",94));
    }


    public void start() {
        while (true) {
            showMenu();
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    queryStudents();
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }

    }
//    增
        public void addStudent(){
            System.out.println("请输入要添加的学生学号");
            String sid= sc.next();
            if(isExists(sid)){
                System.out.println("输入的学号已存在");
            }else {
                list.add(addMessage(sid));
            }
        }
        //删
        public void deleteStudent(){
            String id= inputMessage();
            list.remove(getIndex(id));
        }
        //改
        public void updateStudent(){
           String id= inputMessage();
            list.set(getIndex(id),addMessage(id));
        }
        //查
        public static void queryStudents(){
            if(list.isEmpty()){
                System.out.println("暂无信息请录入");
            }else {
                System.out.println("学号\t姓名\t成绩");
                for (Student stu : list) {
                    if (stu != null) {
                        System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getScore());
                    }
                }
            }
        }
        //    存在方法
        public boolean isExists(String id) {
                // 假设id在数组中不存在
                boolean exists = false;
                // 遍历数组, 获取每一个学生对象, 准备进行判断
                for (Student stu : list) {
                    if(stu.getId().equals(id)){
                        exists = true;
                        break;
                    }
                }

                return exists;
            }
//            删除，修改 重复调用的代码
        public String inputMessage(){
            String sid;
            while (true){
                System.out.println("请输入学生学号");
                sid= sc.next();
                if(!isExists(sid)){
                    System.out.println("输入的学生信息不存在请重新输入");
                }else {
                    break;
                }
            }
            return sid;
        }

//        增加，修改，重复调用的代码
        public Student addMessage(String id){
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生成绩");
            int score = sc.nextInt();
            return new Student(id,name,score);
        }

    //获取索引，删除和修改重复调用
        public static int getIndex(String id){
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(id.equals(student.getId())){
                index=i;
            }
        }
        return index;
    }

}