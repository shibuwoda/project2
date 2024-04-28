package Colunm;
import java.util.TreeSet;

public class ColumnTest {
//    (3)创建圆柱数组ColumnArray，放入5个圆柱对象，例如（半径，高）：
        public static void main(String[] args) {
            TreeSet<Column> ColumnArray = new TreeSet<>();
            Column column = new Column(5, 3);
            Column column2 = new Column(2, 4);
            Column column3 = new Column(4, 3);
            Column column4 = new Column(2, 3);
            Column column5 = new Column(4, 6);
            ColumnArray.add(column);
            ColumnArray.add(column2);
            ColumnArray.add(column3);
            ColumnArray.add(column4);
            ColumnArray.add(column5);
            for (Column c : ColumnArray) {
                System.out.println(c);
            }
        }


//            （5，3），（2，4），（4，3），（2，3），（4，6）
//            (4)对数组进行自动排序，输出数组元素，期待的排序结果为：
//            （2，3），（2，4），（4，3），（4，6），（5，3）
}
