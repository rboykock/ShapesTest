package pro.cherkassy.rboyko.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rboyko on 31.01.17.
 */
public class SquareTest {

    Square square;

    @Before
    public void setUp() {
        square = new Square(50);
    }

    @Test
    public void testCalculateArea() {
        assertEquals(2500.0, square.calculateArea(), 0.1);
    }

    @Test
    public void testCalculatePerimeter() {
        assertEquals(200.0, square.calculatePerimeter(), 0.1);
    }

    @After
    public void clean() {
        square = null;
    }
}