package demo.aboutmethod;

public class Demo1 {

    public static void main(String[] args) {

        String a = "ni";
        String res = new Demo1().test(a);
        System.out.println(a == res);

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] temp1 = arr;
        int[] temp2 = arr;
        int[] temp3 = arr;
        int[] temp4 = arr;
        int[] temp5 = arr;
        int[] temp6 = arr;
        int[][] arrs = new int[][] { temp1, temp2, temp3, temp4, temp5, temp6 };
        temp1[0] = 10;
        temp2[1] = 9;

        int pos = 1;
        for (int[] tarArr : arrs) {
            System.out.print("arr" + pos++ + ": \t");
            for (int i : tarArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public String test(String word) {
        word = "hi";
        return word;
    }

}
