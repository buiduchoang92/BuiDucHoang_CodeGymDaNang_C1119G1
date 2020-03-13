import java.util.Scanner;

public class ShowName {
    public static void main(String[] args) {
        System.out.println("Enter Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("hello " + name );
    }
}
