package demo.aboutobjectoriented.demo3;

/**
 * @author
 */
public class TheTop {

    // 方法中的变量属于局部变量 不会主动赋值 声明时必须赋值
    public void doSomeThing() {
        // int a;
        int a = 1;
        System.out.println(a);
    }

    public static void main(String[] args) {
        String words2 = "321";
        String words1 = "123" + words2;
        String words3 = new String("333");
    }
}
