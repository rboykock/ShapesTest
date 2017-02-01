package pro.cherkassy.rboyko.shapes;

import pro.cherkassy.rboyko.Shapes;
import pro.cherkassy.rboyko.interfaces.IShape;

import java.util.Locale;

/**
 * Created by rboyko on 28.10.16.
 */
public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        String str = "Square:\n\t";
        for (Triangle triangle : triangles)
            str += triangle.toString();
        return str;

    }
}
