package pro.cherkassy.rboyko;

import pro.cherkassy.rboyko.interfaces.IInputVaries;
import pro.cherkassy.rboyko.shapes.Circle;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by rboyko on 31.10.16.
 */
public class SquareInput extends CircleInput {

    public double[] getParams(BufferedReader br) {
        do {
            System.out.print("Enter square side: ");
            double param = getProperties(inputString(br));
            if (param != 0) {
                double[] params = {param};
                return params;
            }
            System.out.println("ERROR: Wrong  arguments.Try again");
        } while (true);
    }
}
