package demo.aboutarray;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Run {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int size = in.nextInt();

        TreeSet<Integer> set = new TreeSet<>((Integer a, Integer b) -> {
            return a >= b ? (a == b ? 0 : 1) : -1;
        });
        set.add(Integer.valueOf(2));
        set.add(Integer.valueOf(1));
        for (int i = 0; i < size; i++) {
            int val = in.nextInt();
            set.add(Integer.valueOf(val));
        }

        System.out.println(" ======== ");
        set.forEach((v) -> {
            System.out.println(v);
        });
    }
}
