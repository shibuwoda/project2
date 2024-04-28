import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
        public static void method(){
            Scanner sc = new Scanner(System.in);
            ArrayList<Student> list = new ArrayList<>();
            while (true) {
                // 1. 搭建主界面菜单
                System.out.println("--------欢迎来到学生管理系统--------");
                System.out.println("1 添加学生");
                System.out.println("2 删除学生");
                System.out.println("3 修改学生");
                System.out.println("4 查看学生");
                System.out.println("5 退出");
                System.out.println("请输入您的选择:");

                String choice = sc.next();

                switch (choice) {
                    case "1":
//                        System.out.println("添加学生");
                        //获取用户信息 s
                        addStudent(list);
                        break;
                    case "2":
//                        System.out.println("删除学生");
                        deleteStudent(list);
                        break;
                    case "3":
//                        System.out.println("修改学生");
                        updateStudent(list);
                        break;
                    case "4":
//                        System.out.println("查看学生");
                        queryStudents(list);
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
        private ArrayList<Student> list;
//        抽取scanner
//        private Scanner scanner;
//        抽取用户输入方法
//    isexcist
//    抽取录入的学生信息


//    增
       public static void addStudent(ArrayList<Student> list){
           Scanner scanner = new Scanner(System.in);
           String sid;
//           重复输入,如果输入的学号已存在，重新输入
           while(true){
               System.out.println("请输入学号:");
               sid = scanner.next();

               int index = getIndex(list, sid);

               if(index == -1){
                   // sid不存在, 学号可以使用
                   break;
               }else {
                   System.out.println("输入的学号已存在，请重新输入");
               }
           }
           System.out.println("请输入学生姓名");
           String name= scanner.next();
           System.out.println("请输入学生成绩");
           int score=scanner.nextInt();
//           集合中录入数据
           list.add(new Student(sid,name,score));
       }



//    删
    public static void deleteStudent(ArrayList<Student> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号");
        String sid= scanner.next();
        int index=getIndex(list,sid);
        if(index==-1){
            System.out.println("要删除的学生信息不存在");
        }else {
            list.remove(index);
        }
    }

//    改
    public static void updateStudent(ArrayList<Student> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号");
        String sid=scanner.next();
        int index= getIndex(list,sid);
        if(index==-1){
            System.out.println("要修改的学生信息不存在");
        }else {
            Student stu=list.get(index);
            System.out.println("请输入要修改学生的姓名");
            String name = scanner.next();
            stu.setName(name);
            System.out.println("请输入要修改学生的成绩");
            int score = scanner.nextInt();
            stu.setScore(score);
        }
    }
//    查
    public static void queryStudents(ArrayList<Student> list){
        StringBuilder str = new StringBuilder();
        str.append("学号").append("\t").append("姓名").append("\t").append("\t").append("成绩").append("\n");
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            str.append(stu.getId()).append("\t").append(stu.getName()).append("\t").append(stu.getScore()).append("\n");

        }
        System.out.println(str.toString());
    }
//    查看学号在集合中是否存在
    public static int getIndex(ArrayList<Student> list,String id){
//            遍历集合，存在返回索引，不存在返回-1
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