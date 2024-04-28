package inter;
public interface IntStack {
        void push(int item);//元素进栈

        int pop();//栈顶元素出栈

        int peek();//返回栈顶元素

        boolean empty();//判断栈是否为空

}