package demo.aboutextends;

public class Top {

    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        sub1.test();
    }

    public static void test() {
        System.out.println("Top");
    }
}

class Sub1 extends Top {

    public static void test() {
        System.out.println("Sub1");
    }
}