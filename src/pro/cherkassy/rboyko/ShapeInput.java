package pro.cherkassy.rboyko;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by rboyko on 31.10.16.
 */
public class ShapeInput {
    protected String inputString(BufferedReader br) {
        String inputString = "";
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString;
    }
}
