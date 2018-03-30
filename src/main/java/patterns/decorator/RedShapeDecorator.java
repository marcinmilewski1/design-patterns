package patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return super.draw() + " red";
    }
}
