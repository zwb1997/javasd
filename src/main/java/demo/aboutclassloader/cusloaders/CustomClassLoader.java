package demo.aboutclassloader.cusloaders;

public class CustomClassLoader extends ClassLoader{
    
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassFromFile(name);
        return defineClass(name, b, 0,b.length);
    }

    private byte[] loadClassFromFile(String name) {
        return null;
    }
}
