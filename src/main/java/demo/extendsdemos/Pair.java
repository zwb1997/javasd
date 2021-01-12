package demo.extendsdemos;

public class Pair<T> {
    private T date;

    public void setValue(T date) {
        this.date = date;
    }

    public T getValue() {
        return date;
    }
}
