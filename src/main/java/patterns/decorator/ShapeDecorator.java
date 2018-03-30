package patterns.decorator;

public abstract class ShapeDecorator implements Shape{
    private final Shape shape;

    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public String draw() {
        return this.shape.draw();
    }
}
