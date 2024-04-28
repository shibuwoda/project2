public class Demo5 {
    public static void main(String [] args){
        int year= 2004;
        if ( year %4 == 0 && year % 100 != 0 ||  year% 400 == 0 ){
        System.out.println("是闰年");} else {
            System.out.println("不是闰年");
            /**
             *
             */
        }
    }

}
