import patterns.decorator.Circle
import patterns.decorator.Rectangle
import patterns.decorator.RedShapeDecorator
import patterns.decorator.Shape
import spock.lang.Specification
/* Dynamically adds responsibility to the interface by wrapping the original code
*/

class DecoratorSpec extends Specification {
    def "Should draw normal shapes"() {
        given:
        Shape shape1 = new Circle()
        Shape shape2 = new Rectangle()

        expect:
        shape1.draw() == "normal circle"
        shape2.draw() == "normal rectangle"
    }

    def "Should draw different shapes based on decoration"() {
        given:
        Shape circleDecorated = new RedShapeDecorator(new Circle())
        Shape rectangleDecorated = new RedShapeDecorator(new Rectangle())

        expect:
        circleDecorated.draw() == "normal circle red"
        rectangleDecorated.draw() == "normal rectangle red"
    }
}