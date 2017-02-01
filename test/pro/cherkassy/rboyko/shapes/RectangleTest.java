package pro.cherkassy.rboyko.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rboyko on 31.01.17.
 */
public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(20, 50);
    }

    @Test
    public void testCalculateArea() {
        assertEquals(1000.0, rectangle.calculateArea(), 0.1);
    }

    @Test
    public void testCalculatePerimeter() {
        assertEquals(140.0, rectangle.calculatePerimeter(), 0.1);
    }


    @After
    public void clean() {
        rectangle = null;
    }

}