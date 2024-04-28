package UDP;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName("StudentManager.Student");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

    }
}
