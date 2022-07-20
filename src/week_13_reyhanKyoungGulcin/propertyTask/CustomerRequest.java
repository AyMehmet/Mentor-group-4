package week_13_reyhanKyoungGulcin.propertyTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerRequest {

    public static void main(String[] args) {


        Shape property1 = new Circle("circleHouse", 15);

        Shape property2 = new Square("squareHouse", 20);

        Shape property3 = new Square("SquareHouse2", 25);

        Shape property4 = new Rectangle("rectangleHouse", 20, 30);


        ArrayList<Shape> properties = new ArrayList<>(Arrays.asList(property1, property2, property3, property4));


        System.out.println("how many square meters do you want for your house?");
        double sm = new Scanner(System.in).nextDouble();

        for (Shape each : Shape.suitableProperties(properties, sm)) {
            System.out.println(each.getName());
        }


    }
}
