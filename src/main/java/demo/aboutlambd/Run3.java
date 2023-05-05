package demo.aboutlambd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run3 {
    

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        Object[] objs = list.stream().parallel().toArray();
        System.out.println(Arrays.toString(objs));
    }
}
