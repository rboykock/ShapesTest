package pro.cherkassy.rboyko.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rboyko on 30.01.17.
 */
public class CircleTest {

    Circle circle = null;

    @Before
    public void setUp() {
        circle = new Circle(20);
    }

    @Test
    public void testCalculateArea() {
        assertEquals(1256.63, circle.calculateArea(), 0.01);
    }

    @Test
    public void testCalculatePerimeter() {
        assertEquals(125.663, circle.calculatePerimeter(), 0.001);
    }

    @After
    public void clean() {
        circle = null;
    }
}