package demo.aboutgenericity;

public class Demo<T> {

    private T datal;
    private String id;

    public String getId() {
        return id;
    }

    public T getDatal() {
        return datal;
    }

    public void setDatal(T datal) {
        this.datal = datal;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
            " datal='" + getDatal() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }

}
