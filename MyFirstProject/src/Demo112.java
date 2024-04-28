public class Demo112 {
    public static void main(String[] args) {
        int[][] a =new int [2][3];
        System.out.println(a.length);//2  大数组长度为2
        System.out.println(a[0].length);//3  里面第一个小数组长度为3

                float f=0.0f;
                f+=1.0;
                System.out.println(f);
                String s = "Story";
                s += "books";
                //char c = s[1]; 非数组
                char d = s.charAt(1);
                int len = s.length();
        System.out.println(d);//t
        System.out.println(len);// 10
        String t = s.toLowerCase();
        System.out.println(t);//storybooks
//        String  x=null;
//        int  y=(x!=null)&&(x.length()>0) ? x.length() : 0;
//        System.out.println(y);
//        System.out.println(x);
//        System.out.println(x!=null);
       // String  x="Hello";  int  y=9;  if(x==y)  { }
        String v = "a";
        String v2 = "a";
        System.out.println(v==v2);
        System.out.println(v.equals(v2));
        String v3 = "Gone with the wind";
        String standard = v3.toUpperCase();
        System.out.println(standard);
        String p = "hello";
        char c[] = {'h','e','l','l','o'} ;
        System.out.println(p.equals(c));
       // String str=(String)'H';
        int a1 = 3 ;
        int c1;
        if(a1>0)
            if(a1>3)
                c1 = 2;
            else c1 = 3;
        else c1 = 4;
        System.out.println(c1);
        int x = 5;
        if(x>4){
            System.out.println("test1");
        } else if (x>9) {
            System.out.println("test2");
        }else{
            System.out.println("test3");
        }
        int i=9;
        switch (i) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
        }








    }
}
