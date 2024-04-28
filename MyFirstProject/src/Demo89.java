import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo89 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start=simpleDateFormat.parse("2022-08-01");
        Date end=simpleDateFormat.parse("2022-09-01");
        long startTime= start.getTime();
        long endTime=end.getTime();
        long num=endTime-startTime;
        System.out.println(num/1000/60/60/24);//计算两个日期相隔多少天 

    }
}
