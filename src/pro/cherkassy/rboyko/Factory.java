package pro.cherkassy.rboyko;

import pro.cherkassy.rboyko.interfaces.IInputVaries;
import pro.cherkassy.rboyko.interfaces.IShape;
import pro.cherkassy.rboyko.shapes.*;

/**
 * Created by rboyko on 28.10.16.
 */
public class Factory {
    public static IShape getShape(Shapes defShape, double[] properties) {
        switch (defShape) {
            case CIRCLE:
                return new Circle(properties[0]);
            case RECTANGLE:
                return new Rectangle(properties[0], properties[1]);
            case SQUARE:
                return new Square(properties[0]);
            case TRIANGLE:
                Triangle triangle = new Triangle(properties[0], properties[1], properties[2]);
                return (triangle.isExist()) ? triangle : null;
        }
        return null;
    }

    public static InputParams getProperties(Shapes defShape) {
        switch (defShape) {
            case CIRCLE:
                return new InputParams(new CircleInput());
            case RECTANGLE:
                return new InputParams(new RectangleInput());
            case SQUARE:
                return new InputParams(new SquareInput());
            case TRIANGLE:
                return new InputParams(new TriangleInput());
        }
        return null;
    }
}
