package demo.aboutextends;

/**
 * @author 这里 当实例化一个类时 普通代码段 执行优先级高于构造器 也就是说 先执行普通代码段里面的内容 跑完了 执行本类构造器
 */
public class Top2 {
    public Top2() {
        System.out.println("Top2 constructor");
    }

    {
        System.out.println("Top2 code block");
    }
    static {
        System.out.println("Top2 static code block");
    }

    public static void main(String[] args) {
        Top2 sub11 = new Sub11();
        System.out.println(sub11);
    }
}

class Sub11 extends Top2 {
    public Sub11() {
        System.out.println("Sub11 constructor");
    }

    {
        int a = 1;
        System.out.println("Sub11 code block2");
    }
    {
        int a = 1;
        System.out.println("Sub11 code block1");
    }
    {

    }

    static {
        int a = 1;
        System.out.println("Sub11 static code block2");
    }
    static {
        System.out.println("Sub11 static code block1");
    }

}
