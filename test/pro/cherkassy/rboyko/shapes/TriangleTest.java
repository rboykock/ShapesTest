package pro.cherkassy.rboyko.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rboyko on 31.01.17.
 */
public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle(40, 40, 50);
    }

    @Test
    public void testCalculateArea() {
        assertEquals(780.624, triangle.calculateArea(), 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        assertEquals(130.0, triangle.calculatePerimeter(), 0.1);
    }

    @Test
    public void testIsExist() {
        assertTrue(triangle.isExist());
    }

    @Test
    public void testGetHypotenuse() {
        assertEquals(50.0, triangle.getHypotenuse(), 0.1);
    }

    @After
    public void clean() {
        triangle = null;
    }
}