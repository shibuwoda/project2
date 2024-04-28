package inter;

public class TestStack {
    public static void main(String[] args) {
        FixStack fixStack = new FixStack(3);
        System.out.println("--------------元素进栈------------------");
        fixStack.push(5);
        fixStack.push(4);
        fixStack.push(7);
        System.out.println("--------------元素出栈------------------");
        System.out.println(fixStack.pop());
        System.out.println(fixStack.pop());
        System.out.println("--------------返回栈顶元素值------------------");
        System.out.println(fixStack.peek());
    }
}
