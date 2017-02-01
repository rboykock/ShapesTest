package pro.cherkassy.rboyko.shapes;

import pro.cherkassy.rboyko.Shapes;
import pro.cherkassy.rboyko.interfaces.IShape;

import java.util.Locale;

/**
 * Created by rboyko on 28.10.16.
 */
public class Triangle implements IShape {
    protected double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = calculateHypotenuse();
    }

    @Override
    public double calculateArea() {
        double p = (this.a + this.b + this.c) / 2;
        double h = (2 * Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c))) / this.a;
        return (this.a * h) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }

    protected double calculateHypotenuse() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Triangle:\n\ta=%.2f\n\tb=%.2f\n\tc=%.2f\n", this.a, this.b, this.c);
    }

    public boolean isExist() {
        return ((this.a + this.b) > this.c && (this.a + this.c) > this.b && (this.c + this.b) > this.a) ? true : false;
    }

    public double getHypotenuse() {
        return c;
    }
}
