package th3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        System.out.println(shape);

        Circle circle = new Circle(5.0, "blue", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5.0, "purple", false);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle: circles) {
            System.out.println(comparableCircle);
        }

    }
}
