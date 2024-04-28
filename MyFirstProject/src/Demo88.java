import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo88 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDate());
        System.out.println(date.getDay());//星期
        System.out.println(date.getMonth());//月份要加一
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        Date time=Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(time);
        System.out.println(format);//获取格式化时间
    }
}
