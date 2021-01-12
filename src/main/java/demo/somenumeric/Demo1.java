package demo.somenumeric;

import java.io.Closeable;
import java.io.IOException;

public class Demo1 implements Closeable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        // return super.clone(); //error , java.lang.CloneNotSupportException :
        // demo.somenumeric.Demo1
        return new Demo1();
    }

    public static void main(String[] args) {
        Integer a1 = Integer.valueOf(1);
        Integer a2 = Integer.valueOf(1);
        // Integer a3 = Integer.valueOf(127);
        // Integer a4 = Integer.valueOf(127);
        Integer a3 = Integer.valueOf(200);
        Integer a4 = Integer.valueOf(200);
        // System.out.println(a1 == a2);
        // System.out.println(a3.intValue() == a4.intValue());

        // Demo1 d1 = new Demo1();
        // try {

        // Demo1 d2 = (Demo1) d1.clone();
        // System.out.println(d1 == d2);
        // } catch (Exception ex) {
        // System.err.println(ex);
        // }

    }

    @Override
    public void close() throws IOException {

    }
}
