package demo.abouthashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Demo1 {

    public static void main(String[] args) {
        HashMap<Integer, String> theMap = new HashMap<>();

        theMap.put(1, "one");
        theMap.put(2, "two");
        theMap.put(3, "three");

        Iterator itr = theMap.keySet().iterator();

        
        //
        // theMap.forEach((key,val)->{
        // if(key == 1){
        // theMap.remove(1);
        // }
        // });
    }
}
