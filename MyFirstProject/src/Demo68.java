class Panda{
    int age;
    String name;

    public Panda(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof Panda){
            Panda panda=(Panda) obj;//向下转型
            return panda.age==this.age&&panda.name.equals(this.name);
        }
        return false;
    }
    //  *
}
public class Demo68 {
    public static void main(String[] args) {
        Panda panda = new Panda(3,"熊猫");
        Panda panda1=new Panda(3,"熊猫");
        System.out.println(panda==panda1);
        System.out.println(panda.equals(panda1));//false先比较地址，如若不同则直接得出结论
        /**
         * 可以改写equals方法来实现比较内容
         */
        Integer i=new Integer(17777777);
        Integer i1=new Integer(17777777);
        System.out.println(i==i1);//false
        System.out.println(i.equals(i1));//ture
        /**
         * 特殊的是字符和整形equals方法被改写了，因为他们的hashcode编译原理不同于其他
         */
        String a="a";
        String b="a";
        System.out.println(a.hashCode());//97
        System.out.println(b.hashCode());//98
    }
}
