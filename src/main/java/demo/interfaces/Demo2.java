package demo.interfaces;

/**
 * @author
 */
public class Demo2 {

    interface Ainterface {
        /**
         * do some
         */
        void doSome();
    }

    static class D2Inner1 implements Ainterface {
        @Override
        public void doSome() {
            System.out.println("d2 do something.");
        }
    }
}

class Demo3 extends Demo2.D2Inner1 {

    public Demo3() {
        super();
    }

    @Override
    public void doSome() {
        // TODO Auto-generated method stub

    }
}
