package demo.aboutgenericity;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        Demo<?> d = new Demo<>();
        // d.setDatal(new String("123");
        List<?> mises = new ArrayList<>();

        // mises.add(new String("123"));

        // int i = 1;
        // int j = (i++);
        // System.out.println(j);

        int i = 9;

        switch (i) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
        }
    }
}
