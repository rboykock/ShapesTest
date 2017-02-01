package pro.cherkassy.rboyko;

import pro.cherkassy.rboyko.ShapesDemo;
import pro.cherkassy.rboyko.interfaces.IInputVaries;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by rboyko on 31.10.16.
 */
public class CircleInput extends ShapeInput implements IInputVaries {

    public double[] getParams(BufferedReader br) {

        do {
            System.out.print("Enter radius circle: ");
            double param = getProperties(inputString(br));
            if (param != 0) {
                double[] params = {param};
                return params;
            }
            System.out.println("ERROR: Wrong  arguments.Try again");
        } while (true);
    }

    protected double getProperties(String strProperties) {
        if (strProperties.matches("\\d+(\\.\\d*)?")) {
            return Double.parseDouble(strProperties);

        }
        return 0;
    }
}
