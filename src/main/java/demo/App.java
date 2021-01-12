package demo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int i = add(1, 2);
        Number f = add(1, 1.2);
        System.out.println(f.getClass().getName());
        Object o = add(1, "asd");
        System.out.println(o.getClass().getName());

        ArrayList<String> list1 = new ArrayList<>();
        try {
            list1.getClass().getDeclaredMethod("add", Object.class).invoke(list1, 1);
        } catch (Exception e) {
            // TODO: handle exception
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list1.getClass().getName());
        System.out.println(list2.getClass().getName());

        ArrayList<Integer> a = App.<ArrayList<Integer>>add(list2, list2);
        ArrayList<? extends Object> a2 = add(list1, list2);
        System.out.println(a2.getClass().getName());
        // if (list1 instanceof ArrayList<?>) {
        // System.out.println("list1 is ArrayList<String>");
        // }
        // if (list2 instanceof ArrayList<?>) {
        // System.out.println("list2 is ArrayList<Integer>");
        // }

    }

    public static <T> T add(T x, T y) {
        return y;
    }
}
