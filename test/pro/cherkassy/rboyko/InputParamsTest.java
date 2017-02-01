package pro.cherkassy.rboyko;

import org.junit.Test;
import org.mockito.Mockito;


import static org.junit.Assert.*;

/**
 * Created by rboyko on 31.01.17.
 */
public class InputParamsTest {


    @Test
    public void testCircleInput() {

        CircleInput mockCircleInput = Mockito.mock(CircleInput.class);
        Mockito.when(mockCircleInput.getParams(Mockito.any())).thenReturn(new double[]{50.0});
        InputParams inputParams = new InputParams(mockCircleInput);
        double[] params = inputParams.input();
        Mockito.verify(mockCircleInput).getParams(Mockito.any());
        assertEquals(50.0, params[0], 0.1);
    }

    @Test
    public void testRectangleInput() {

        RectangleInput mockRectangleInput = Mockito.mock(RectangleInput.class);
        Mockito.when(mockRectangleInput.getParams(Mockito.any())).thenReturn(new double[]{50.0, 60.0});
        InputParams inputParams = new InputParams(mockRectangleInput);
        double[] params = inputParams.input();
        Mockito.verify(mockRectangleInput).getParams(Mockito.any());
        assertEquals(50.0, params[0], 0.1);
        assertEquals(60.0, params[1], 0.1);
    }

    @Test
    public void testSquareInput() {

        SquareInput mockSquareInput = Mockito.mock(SquareInput.class);
        Mockito.when(mockSquareInput.getParams(Mockito.any())).thenReturn(new double[]{70.0});
        InputParams inputParams = new InputParams(mockSquareInput);
        double[] params = inputParams.input();
        Mockito.verify(mockSquareInput).getParams(Mockito.any());
        assertEquals(70.0, params[0], 0.1);
    }

    @Test
    public void testTriangleInput() {

        TriangleInput mockTriangleInput = Mockito.mock(TriangleInput.class);
        Mockito.when(mockTriangleInput.getParams(Mockito.any())).thenReturn(new double[]{50.0, 50.0, 40.0});
        InputParams inputParams = new InputParams(mockTriangleInput);
        double[] params = inputParams.input();
        Mockito.verify(mockTriangleInput).getParams(Mockito.any());
        assertEquals(50.0, params[0], 0.1);
        assertEquals(50.0, params[1], 0.1);
        assertEquals(40.0, params[2], 0.1);
    }
}