package demo.aboutextends;

public class Top {

    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        sub1.doSomeThing();
        Top top = new Sub1();
        Top top1 = new Top();
        top.topMethod();
        top1.topMethod();
    }

    public static void test() {
        System.out.println("Top");
    }

    private final void doSomeThing() {
        System.out.println(1);
    }

    /**
     * method re-write
     * 
     * @return
     */
    protected Number topMethod() {
        throw new Error("top is not active in Top class!");
    }

    public void someParams(int i) {
        System.out.println("accept int type!");
    }

    public void someParams(double i) {
        System.out.println("accept double type!");
    }

    public void someParams(float i) {
        System.out.println("accept float type!");
    }

    public void someParams(String i) {
        System.out.println("accept String type!");
    }

    public void someParams(char i) {
        System.out.println("accept char type!");
    }

    public int someParams(int i, double d) {
        System.out.println("accept int and double type!");
        return i;
    }
}

class Sub1 extends Top {

    public static void test() {
        System.out.println("Sub1");
    }

    public final void doSomeThing() {
        System.out.println(2);
    }

    @Override
    public Integer topMethod() {
        System.out.println("here is sub!");
        return 0;
    }

}