package demo.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TryArrayList {

    private ArrayList<Integer> intList = new ArrayList<>();

    public TryArrayList() {

    }

    public ArrayList<Integer> getIntList() {
        return intList;
    }

    public void doRemove() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        log.info("before remove item, array list is -> [{}]", list.toString());
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int val = itr.next();
            new Thread(new DoRemove(list)).start();
            
            Thread.sleep(300);
            if (val == 1) {
            itr.remove();
            }
        }

        log.info("after remove item, array list is -> [{}]", list.toString());
    }

    public static void main(String[] args) throws Exception {
        new TryArrayList().doRemove();
    }

    private static final class DoRemove implements Runnable {

        private ArrayList<Integer> list;

        public DoRemove(ArrayList<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            this.list.add(33333333);
        }
    }
}
