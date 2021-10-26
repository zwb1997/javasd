package demo.jvm_demos.chapter_seven;

public class Sample_7_4_Loader {

    public static void main(String[] args) {

        ClassLoader demo = new ClassLoader() {

            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                // String fileName = name.substring(beginIndex)
                return null;
            }
        };
    }
}
