package checkColorable;

import CheckResizeable.Cricle;
import CheckResizeable.Rectangle;
import CheckResizeable.Shape;
import CheckResizeable.Square;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(3,"blue",false);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Cricle(4);
        shapes[3] = new Rectangle(5,7);
        shapes[4] = new Cricle(8);
        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}
