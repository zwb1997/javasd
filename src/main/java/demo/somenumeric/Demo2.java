package demo.somenumeric;

public class Demo2 {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Demo2 d21 = new Demo2();
        Demo2 d22 = new Demo2();
        d21.setAge(1);
        d22.setAge(1);
        System.out.println(d21.equals(d22));
        System.out.println(42 == 42.0);
        var a = 123.321D;
        var b = 123.321f;
        System.out.println(a);
        System.out.println(a);

        Integer aa = 1;
        Integer bb = 2;
        Long al = 1L;
        Integer cc = aa + bb;
        System.out.println(cc.getClass().getName());
        Long g = 3L;
        Long h = 2L;
        System.out.println(g.equals(aa + bb));

        System.out.println(aa.equals(al));
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (!(obj instanceof Demo2)) {
            return false;
        }
        Demo2 d = (Demo2) obj;
        return d.getAge() == this.getAge();
    }

    @Override
    public int hashCode() {
        return this.age;
    }
}
