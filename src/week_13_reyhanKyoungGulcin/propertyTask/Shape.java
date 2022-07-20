package week_13_reyhanKyoungGulcin.propertyTask;

import java.util.ArrayList;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                " area=" + area() +
                '}';
    }

    public static ArrayList<Shape> suitableProperties(ArrayList<Shape> properties, double squareMeters) {
        ArrayList<Shape> houses = new ArrayList<>();
        for (Shape each : properties) {
            if (each.area() >= squareMeters) {
                houses.add(each);
            }
        }
        return houses;
    }
}
/**
 * A real estate agent asked you to write a program. He said that he has properties in the shapes of squares, rectangles,
 * circles, etc., and that he wants to market them by filtering according to the square meters in line with the wishes of his customers.
 * <p>
 * Tips:
 * Each property's name and features will be kept as an ArrayList.
 * Define an abstract class to keep name of the properties and calculate the area and subclasses to calculate the area of each shape.
 * Write a method that will take this ArrayList and return a property list whose areas are equal or more than the request of a client.
 * <p>
 * Example:
 * input :
 * properties of real estate agent :
 * Square Houses
 * SquareHouse-1 with 20 m side,
 * SquareHouse-2 with 25 m side,
 * SquareHouse-3 with 30 m side
 * Rectangle Houses
 * RectangleHouse-1 with 20 x 30,
 * RectangleHouse-2 with 20 x 25
 * Circle Houses
 * CircleHouse-1 with 15 m radius,
 * CircleHouse-2 20 m radius,
 * CircleHouse-3 10 m radius
 * <p>
 * customer request : Houses with area under 600 square meters will not be accepted...
 * <p>
 * <p>
 * <p>
 * output :
 * [SquareHouse-2 , SquareHouse-3 , RectangleHouse-1 , CircleHouse-1 , CircleHouse-2 ]
 */