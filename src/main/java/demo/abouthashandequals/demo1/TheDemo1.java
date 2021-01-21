package demo.abouthashandequals.demo1;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
public class TheDemo1 {

    public static void main(String[] args) {
        HashMap<String, Integer> theMap = new HashMap<>(16);
        String a = new String("one");
        String b = new String("one");

        theMap.put(a, 1);

        System.out.println(theMap.get(a));
        System.out.println(theMap.get(b));

        HashMap<DemoClass, Integer> theMap1 = new HashMap<>(16);
        DemoClass d1 = new DemoClass("word");
        DemoClass d2 = new DemoClass("word");
        theMap1.put(d1, 10);

        System.out.println(theMap1.get(d1));
        System.out.println(theMap1.get(d2));

    }
}

class DemoClass {
    private String theWord;

    public DemoClass() {

    }

    public DemoClass(String theWord) {
        this.theWord = theWord;
    }

    public String getTheWord() {
        return theWord;
    }

    public void setTheWord(String theWord) {
        this.theWord = theWord;
    }

    @Override
    public String toString() {
        return this.theWord;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DemoClass)) {
            return false;
        }
        DemoClass theObject = (DemoClass) obj;
        return this.theWord.equals(theObject.theWord);
    }

    @Override
    public int hashCode() {
        StringBuilder sBuilder = new StringBuilder();
        String curWord = this.theWord.length() > 4 ? sBuilder.append(this.theWord).substring(0, 4) : this.theWord;
        sBuilder.delete(0, sBuilder.length());
        for (char c : curWord.toCharArray()) {
            sBuilder.append(c % 100 + 0);
        }
        int curHash = Integer.parseInt(sBuilder.toString());
        return curHash;
    }
}
