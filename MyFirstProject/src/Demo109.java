public class Demo109 {
    public static void main(String[] args) {
        String s = "home directory";
        int n = 3;
        String t = s + n;
        // 这里会抛出StringIndexOutOfBoundsException异常，因为尝试将一个整数与字符串相加是不允许的
       // String s = "you are welcome";
//        String t;
       // t = s[3] + "one"; // 这里会抛出StringIndexOutOfBoundsException异常，因为s[3]会返回'o'，然后尝试将"one"连接到它的后面，这会导致异常
        System.out.println(s.length());
        System.out.println(t);
    }
}
