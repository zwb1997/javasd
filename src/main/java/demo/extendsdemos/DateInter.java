package demo.extendsdemos;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author
 */
public class DateInter<T> extends Pair<Date> {

    // public static T data;

    public static <Tasd> Tasd show(Tasd one) {
        return one;
    }

    @Override
    public void setValue(Date date) {
        // TODO Auto-generated method stub
        super.setValue(date);
    }

    @Override
    public Date getValue() {
        // TODO Auto-generated method stub
        return super.getValue();
    }

    // public void do1() {

    // }

    // public int do1() {
    // return -1;
    // }

    public static void main(String[] args) {
        DateInter d1 = new DateInter();
        d1.setValue(new Date());

        ArrayList<String> arrayList = new ArrayList<String>();
        if (arrayList instanceof ArrayList) {
            System.out.println(1);
        }
    }
}
