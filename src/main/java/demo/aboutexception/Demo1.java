package demo.aboutexception;

import java.io.IOException;

/**
 * 异常的顶级类 Throwable 其中重要的两个子类 Error 和 Exception ; Error 类无法try/catch
 * 往往发生时JVM会选择终止线程运行 ; Exception 分为 检查时异常(checked exception) 这种异常必须手动try/catch
 * 或者层层抛出(throws) ; 非检查时异常(unchecked exception) 这种异常无需主动try/catch(当然也可以try/catch
 * 和 throws)
 */
public class Demo1 {

    /**
     * finally could cover the return value in java function
     * 
     * @param value
     * @return
     * 
     */
    public static int f(int value) {
        try {
            System.out.println(1);
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }

    // public static void main(String[] args) throws Exception {
    public static void main(String[] args) {

        // Demo1 d1 = new Demo1();
        // // d1.doSomeThing();
        // d1.doSomeThing(1);
        // System.out.println();
        // System.out.println(Demo1.f(2));
        int i = new Demo1().doSomeThing_1();

        System.out.println(i);
    }

    public int doSomeThing_1() {
        int i = 0;
        try {
            i = 1;
            return i;
        } catch (Exception ex) {
            System.err.println("error!");
            i = 2;
            return i;
        } finally {
            i = 3;
            return i;
        }
    }

    public void doSomeThing() {
        new ClassCastException("class cast exception!");
    }

    /**
     * whatever in try block or catch block, if use finally , the code in finally
     * will execute then execute return;
     * 
     * but sometime finally will not work 1.use System.exit(int) in try or catch
     * code block,but if System.exit(int) exec after the try/catch block ,finally
     * still work correct 2. thread dead which run the program 3.shutdown the cpu
     * 
     * @param i
     */
    public void doSomeThing(int i) {
        try {
            System.out.println("find an IOException");
            throw new IOException();
        } catch (Exception ex) {
            System.out.println(ex);
            return;
        } finally {
            System.out.println("the finally!");
            // System.exit(-1);
        }
    }

}
