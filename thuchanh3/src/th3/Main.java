package th3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        System.out.println(shape);

        Circle circle = new Circle();


        System.out.println("Pre-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : Circle) {
            System.out.println(circle);
        }
        }

    }
}
