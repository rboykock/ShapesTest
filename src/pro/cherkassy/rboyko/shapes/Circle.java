package pro.cherkassy.rboyko.shapes;

import pro.cherkassy.rboyko.Shapes;
import pro.cherkassy.rboyko.interfaces.IShape;

import java.util.Locale;

/**
 * Created by rboyko on 28.10.16.
 */
public class Circle implements IShape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Circle:\n\tradius=%.2f", this.radius);
    }

}
