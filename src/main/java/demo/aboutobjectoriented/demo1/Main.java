package demo.aboutobjectoriented.demo1;

public class Main {

    public static void main(String[] args) {
        TheTop top = new TheSub1();
        top.setTheNumber('1');
        System.out.println(top.getTheNumber());
    }
}
