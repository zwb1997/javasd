package demo.jvm_demos.chapter_seven;

public class Sample_7_7 {
    private static int i;
    private static final String WOED;

    static {
        int i = 1;
        WOED = "ddss";
    }

    interface Demo1 {
        int a = 1;
    }

    interface Demo2 extends Demo1 {
        int b = 2;
    }

    static class DemoClass1 implements Demo2 {
        public static final String word = "hello_demo_class_1";
    }

    public static void main(String[] args) {
        new DemoClass1();
        System.out.println(DemoClass1.b);
        System.out.println(Sample_7_7.i);
        System.out.println(Sample_7_7.WOED);
    }
}
