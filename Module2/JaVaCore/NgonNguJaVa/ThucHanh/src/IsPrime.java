import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int i = 2;
        boolean check = true;
        if (i < 2){
            System.out.println("is not a prime");
        }else {
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        if (check) System.out.println(number + " is a prime");
        else System.out.println(number + " is not prime");
        }
    }
}
