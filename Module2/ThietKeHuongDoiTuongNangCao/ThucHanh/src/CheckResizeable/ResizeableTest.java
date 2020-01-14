package CheckResizeable;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(3,5);
//        System.out.println(rectangle.getArea());
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2,3);
        shapes[1] = new Cricle(1.5);
        Random rd = new Random();
//        rectangle.resize(rd.nextDouble());
        for (int i = 0 ;i < shapes.length ; i++) {
            shapes[i].resize(rd.nextDouble());
        }
    }
}
