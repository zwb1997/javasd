package demo.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author
 */
public class Demo1 implements MutiA, MutiB {

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        test(d);

        List<String> strs = new ArrayList<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add("123");
            }
        };
        List<? extends Number> list1 = new ArrayList<>();
        List<? super Number> list2 = new ArrayList<>();

        list2.add(Integer.valueOf(1));
        Object obj = list2.get(0);
        System.out.println(obj.getClass().getName());
    }

    public static <T extends MutiA & MutiB> void test(T t) {
        Objects.requireNonNull(t);
        t.sayA();
        t.sayB();
    }

    // public static <T extends Number> void test1(T t) {

    // }
    public static void test2(List<? extends Number> t) {
        for (Number m : t) {
            System.out.println(m.toString());
        }
    }

    public static void test3(List<? super Number> t) {

    }

    @Override
    public void sayA() {
        System.out.println("implement sayA()");
    }

    @Override
    public void sayB() {
        System.out.println("implement sayB()");
    }
}

interface MutiA {
    void sayA();
}

interface MutiB {
    void sayB();
}
