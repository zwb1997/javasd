package demo;

public class Demo1 {

    public static void main(String[] args) {
        Demo<String> d = new Demo<>();
        d.setData("words!");
        System.out.println(d.getData());
    }

}

class Demo<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}