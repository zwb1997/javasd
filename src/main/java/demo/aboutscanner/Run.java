package demo.aboutscanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Run {

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = input.readLine();
            System.out.println(s);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
