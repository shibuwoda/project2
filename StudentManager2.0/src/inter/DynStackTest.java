package inter;

public class DynStackTest {
    public static void main(String[] args) {
        DynStack dynStack = new DynStack();
        System.out.println("--------------元素进栈------------------");
        dynStack.push(8);
        dynStack.push(7);
        System.out.println("--------------返回栈顶元素值------------------");
        System.out.println(dynStack.peek());
        System.out.println("--------------元素进栈------------------");
        dynStack.push(9);
        System.out.println("--------------元素出栈------------------");
        System.out.println(dynStack.pop());
        System.out.println(dynStack.pop());


    }
}
