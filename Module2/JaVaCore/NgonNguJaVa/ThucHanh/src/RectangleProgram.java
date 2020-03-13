import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = scanner.nextFloat();
        System.out.println("Enter Heigth: ");
        heigth = scanner.nextFloat();
        float area = width * heigth;
        System.out.println("Area is" + area);
    }
}
