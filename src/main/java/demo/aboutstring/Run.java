package demo.aboutstring;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        String a = new String("abc");
        String b = "abc";
        
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}
