import java.util.Scanner;

public class Demo110 {
    private static int year;
    private static int month;

    public static void main(String[] args) {
        //1:获取用户要打印的年份、月份
        readInput();
        //2：根据用户输入，打印日历
        //2.1 根据用户输入，打印月份的头部
        printMonthTitle();
        //2.2 根据用户输入，打印月份的主体
        //这一年这一月第一天是周几
        //2.2.1 这一年这一月离1800年1月1日有多少天
        //2.2.2 为了计算某一年是365天？还是366天？判断是否为闰年

    }

    //1:获取用户要打印的年份、月份
    public static void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        year = input.nextInt();
        System.out.println("请输入月份：");
        month = input.nextInt();
    }

    //2.1 根据用户输入，打印月份的头部
    public static void printMonthTitle() {
        // 打印：March  2023  用户输入：3  2023
        String monthName = getMothName(month);
        System.out.println("\t" + monthName + "\t" + year);
        //------------------------
        System.out.println("-------------------------------");
        //Sun  Mon Tue Wed Thu Fri Sat
        System.out.println("Sun  Mon Tue Wed Thu Fri Sat");
    }

    // 根据用户输入的整数月份，返回字符串英文月份名称
    public static String getMothName(int mon) {
        switch (mon) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
        }
        return null;
    }

    //判断某一年是否为闰年
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }

    //判断某一年，某一月多少天
    public static int getNumberOfDaysInMonth (int year,int month) {
        if(month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if(month == 2) {
            return isLeapYear(year)? 29 : 28;
        }
        return 0;//用户输入的月份不合法
    }

    //2.2.1 这一年这一月离1800年1月1日有多少天
    public static int getTotalNumberOfDays(int year,int month) {
        int total = 0;
        //年  目标2023年3月日历  1800-2022年天数
        for (int i = 1800; i < year;i++) {
            if(isLeapYear(i)) {
                total += 366;
            }else {
                total += 365;
            }
        }
        //2023年1月、2月的天数，目标2023年3月
        for(int i = 1;i < month;i++) {
            total += getNumberOfDaysInMonth(year,month);
        }
        return total;
    }


}

