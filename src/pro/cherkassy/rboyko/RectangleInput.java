package pro.cherkassy.rboyko;

import pro.cherkassy.rboyko.interfaces.IInputVaries;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by rboyko on 31.10.16.
 */
public class RectangleInput extends ShapeInput implements IInputVaries {
    @Override
    public double[] getParams(BufferedReader br) {
        do {
            System.out.print("Enter rectangle sides a b: ");
            double[] params = getProperties(inputString(br));
            if (params.length == 2)
                return params;
            System.out.println("ERROR: Wrong  arguments.Try again");
        } while (true);
    }

    protected double[] getProperties(String strParams) {
        if (strParams.matches("(\\d+(\\.\\d*)? ?){2}")) {
            String[] paramsStr = strParams.split(" ");
            double[] params = new double[2];
            byte i = 0;
            for (String param : paramsStr) {
                if (!param.isEmpty() && !param.equals("0")) {
                    params[i] = Double.parseDouble(param);
                    i++;
                }
            }
            return params;

        }
        return new double[0];
    }
}
