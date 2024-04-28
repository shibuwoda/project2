package inter;

public class FixStack implements IntStack {
    private int top;
    private int[] data;


    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public FixStack(int size) {
        this.top = -1;
        this.data = new int[size];
    }

    @Override
    public void push(int item) {
        if (isFull()) {
            throw new IllegalStateException("栈已满，无法添加新元素。");
        }
        data[++top] = item;
        System.out.println("进栈成功");
    }

    @Override
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("栈为空，无法弹出元素。");
        }
        return data[top--];
    }

    @Override
    public int peek() {
        if (empty()) {
            throw new IllegalStateException("栈为空，无法查看栈顶元素。");
        }
        return data[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == data.length- 1;
    }
}