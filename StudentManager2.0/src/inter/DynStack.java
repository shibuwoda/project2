package inter;

import java.util.Arrays;

public class DynStack extends FixStack {
    public DynStack() {
        super(1); // 初始容量设置为1
    }

    @Override
    public void push(int item) {
        try {
            // 尝试使用父类的push方法
            super.push(item);
        } catch (IllegalStateException e) {
            // 如果父类的push方法抛出异常，说明栈已满，进行扩容
            expand();
            // 扩容后重新尝试push
            super.push(item);
        }
    }

    private void expand() {
        // 创建一个新的数组，容量翻倍
        int[] newData = Arrays.copyOf(getData(),getData().length*2);
        setData(newData);
    }
}