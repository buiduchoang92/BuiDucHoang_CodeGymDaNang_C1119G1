import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a");
        Double a = scanner.nextDouble();
        System.out.print("Enter b");
        Double b = scanner.nextDouble();
        if (a != 0){
            Double solution = -b/a;
            System.out.println("The solution is " + solution);
        }else {if (b == 0) {
            System.out.println("The solution is all x!");
        }else {
            System.out.println("No solution!");
        }
        }
    }



}
