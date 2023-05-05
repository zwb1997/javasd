package demo.miscellaneous.demo1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run {
    
    private static final Logger LOG = Logger.getLogger("Run");

    public static void main(String[] args) {
        SuperC sc = new SuperC();
        Sub_1 sb1 = new Sub_1();
        System.out.println(SuperC.num == Sub_1.num);

        System.out.println(SuperC.num);
        SuperC.num ++;
        LOG.log(Level.INFO, "SuperC num -> {0}", SuperC.num);
        LOG.log(Level.INFO, "Sub_1 num -> {0}", Sub_1.num);
    }
}
