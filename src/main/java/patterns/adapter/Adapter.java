package patterns.adapter;

public class Adapter implements Target {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void operation() {
        this.adaptee.specificAdapteeOperation();
    }
}
