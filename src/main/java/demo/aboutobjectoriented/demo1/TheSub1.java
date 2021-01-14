package demo.aboutobjectoriented.demo1;

/**
 * @author
 */
public class TheSub1 extends TheTop {

    public TheSub1() {

    }

    @Override
    public char getTheNumber() {

        System.out.println("sub get number");
        return super.getTheNumber();
    }

    @Override
    public void setTheNumber(char theNumber) {
        System.out.println("sub set number");
        super.setTheNumber(theNumber);
    }
}
