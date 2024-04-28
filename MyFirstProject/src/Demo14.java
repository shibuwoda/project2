/**
 * 九九乘法表的打印
 */
public class Demo14 {
    public static void main(String args []){
        for (int i=1;i<=9;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
/**
 * i=1 ture 进入内层循环 j=1 ture sout j++ j=2 false i++
 * i=2 ture 进入内层循环 j=1 ture sout j++ j=2 ture sout j++ j=3 false i++
 * i=3 ture 进入内层循环 j=1 ture sout j++ j=2 ture sout j++ j=3 ture sout j++ j=4 false i++
 * ...
 */