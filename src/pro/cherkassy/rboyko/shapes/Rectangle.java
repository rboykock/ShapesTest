package pro.cherkassy.rboyko.shapes;

import pro.cherkassy.rboyko.Shapes;
import pro.cherkassy.rboyko.interfaces.IShape;

/**
 * Created by rboyko on 28.10.16.
 */
public class Rectangle implements IShape {

    protected Triangle[] triangles = new Triangle[2];

    public Rectangle(double a, double b) {
        for (byte i = 0; i < triangles.length; i++)
            triangles[i] = new Triangle(a, b);
    }

    @Override
    public double calculateArea() {
        float sum = 0;
        for (Triangle triangle : this.triangles) {
            sum += triangle.calculateArea();
        }
        return sum;
    }

    @Override
    public double calculatePerimeter() {
        float sum = 0;
        for (Triangle triangle : this.triangles) {
            sum += triangle.calculatePerimeter() - triangle.getHypotenuse();
        }
        return sum;
    }


    @Override
    public String toString() {
        String str = "Rectangle:\n\t";
        for (Triangle triangle : triangles)
            str += triangle.toString();
        return str;

    }

}
