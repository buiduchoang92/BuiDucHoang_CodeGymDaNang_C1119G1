import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("blue",true);
        System.out.println(shape);
    }
}
