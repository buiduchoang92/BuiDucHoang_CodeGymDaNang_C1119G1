import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a");
        double a = scanner.nextDouble();
        System.out.print("Enter the b");
        double b = scanner.nextDouble();
        System.out.print("Enter the c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDisciriminant()>=0){
        System.out.println("delta: \n" + quadraticEquation.getDisciriminant());
        System.out.println("Root1: \n" + quadraticEquation.getRoot1());
        System.out.println("Root2: \n" + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDisciriminant()==0){
            System.out.println("-1");
        }else {
            System.out.println("The equation has no roots");
        }
    }

}
