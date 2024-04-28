public class Demo84 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        stringBuffer.append(123);//追加
        stringBuffer.append(456);
        stringBuffer.insert(2,9);//在二号位插入元素
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());//倒序
        System.out.println(stringBuffer.delete(2,3));//删除指定部分

    }
}
