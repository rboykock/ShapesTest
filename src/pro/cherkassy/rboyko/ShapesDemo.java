package pro.cherkassy.rboyko;

import pro.cherkassy.rboyko.interfaces.IShape;
import pro.cherkassy.rboyko.shapes.Circle;
import pro.cherkassy.rboyko.shapes.Rectangle;
import pro.cherkassy.rboyko.shapes.Square;
import pro.cherkassy.rboyko.shapes.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by rboyko on 28.10.16.
 */
public class ShapesDemo {
    public static void main(String[] args) {
        boolean isExit = true;
        IShape shape = null;
        Shapes inputShapeType = null;
        do {
            System.out.print("Please enter shape type or 'help': ");
            String inputStr = ShapesDemo.input();

            if (inputStr.equals("help") || inputStr.equals("?")) {
                System.out.println("Commands:");
                System.out.println("\tcircle");
                System.out.println("\ttriangle");
                System.out.println("\tsquare");
                System.out.println("\trectangle");
                System.out.println("\thelp or ?");
                System.out.println("\texit");
            } else if (inputStr.equals("exit")) {
                isExit = false;
            } else {
                try {
                    inputShapeType = Shapes.valueOf(inputStr.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("ERROR:Invalid command. Try enter 'help' or '?'.");
                    inputShapeType = null;
                }

                if (inputShapeType != null) {
                    InputParams inputParams = Factory.getProperties(inputShapeType);
                    double[] properties = inputParams.input();
                    shape = Factory.getShape(inputShapeType, properties);
                    if (shape == null) {
                        System.out.println("The figure indicating the properties may not exist. Try again");
                    } else {
                        double perimeter = shape.calculatePerimeter();
                        double area = shape.calculateArea();
                        System.out.println(shape.toString());
                        System.out.printf(Locale.US, "Perimeter: %.2f\n", perimeter);
                        System.out.printf(Locale.US, "Area: %.2f\n", area);
                    }
                }
            }
            shape = null;
        } while (isExit);

    }


    public static String input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        try {
            inputStr = br.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStr;
    }
}
