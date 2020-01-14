package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(2);
        circles[2] = new Circle(1.5);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
//        for (int i = 0; i < circles.length-1; i++) {
//            if (circleComparator.compare(circles[i], circles[i + 1]) == 1) {
//                Circle circle = new Circle();
//                circle = circles[i];
//                circles[i] = circles[i+1];
//                circles[i+1] = circle;
//            }
//        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}