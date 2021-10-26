package demo.jvm_demos.chapter_seven;

public class Sample_7_7_muti_threads {

    static class DeadLoopClass {
        static {
            if (true) {
                System.out.println(Thread.currentThread() + " init DeadLoopClass ");
                while (true) {

                }
            }
        }
    }

    static class DemoLoadClass {
        public String word;
        private static DemoLoadClass instance;

        private DemoLoadClass() {
            this.word = "hello!!!!";
        }

        public static DemoLoadClass getInstance() {
            if (instance == null) {
                synchronized (DemoLoadClass.class) {
                    if (instance == null) {
                        instance = new DemoLoadClass();
                    }
                }
            }
            return instance;
        }

    }

    public static void main(String[] args) {
        // Runnable script = () -> {
        // System.out.println(Thread.currentThread() + " start ");
        // DeadLoopClass dlc = new DeadLoopClass();
        // System.out.println(Thread.currentThread() + " run over ");
        // };
        // Thread t1 = new Thread(script, "A");
        // Thread t2 = new Thread(script, "B");
        // t1.start();
        // t2.start();
        Runnable script = () -> {
            String word = DemoLoadClass.getInstance().word;
            System.out.println(Thread.currentThread() + " get word >> " + word);
        };
        Thread[] threads = new Thread[10];
        int pos = 0;
        char namePrefix = '\u0041';
        while (pos++ < 10) {
            threads[pos - 1] = new Thread(script, new String(new char[] { (char) (namePrefix + pos - 1) }));
            threads[pos - 1].start();
        }
    }
}
