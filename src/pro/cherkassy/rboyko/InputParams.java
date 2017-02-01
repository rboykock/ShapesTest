package pro.cherkassy.rboyko;

import pro.cherkassy.rboyko.interfaces.IInputVaries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rboyko on 31.10.16.
 */
public class InputParams {
    IInputVaries iInputVaries;

    public InputParams(IInputVaries input) {
        this.iInputVaries = input;
    }

    public double[] input() {
        return iInputVaries.getParams(this.read());
    }

    protected BufferedReader read() {
        return new BufferedReader(new InputStreamReader(System.in));

    }
}
