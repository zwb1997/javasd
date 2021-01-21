package demo.aboutannotation;

import java.lang.annotation.Annotation;

import demo.aboutannotation.someannotations.DemoAnno;

/**
 * @author
 */
@DemoAnno
public class Demo1 {

    @DemoAnno
    private String str1;

    @DemoAnno
    public void doSome() {

    }

    public static void main(String[] args) {
        try {
            Annotation[] annos = Demo1.class.getDeclaredField("str1").getAnnotations();
            System.err.println(annos.length);
        } catch (Exception ex) {

        }
    }

}
