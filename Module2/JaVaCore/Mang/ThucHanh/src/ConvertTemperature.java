import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        double choice;
        int choose;
        do {
            System.out.println("1");
            System.out.println("2");
            System.out.println("0");
            System.out.println("Enter in choose");
            choose = scanner.nextInt();
            switch (choose){
                case 1 :
                    System.out.println("Enter in fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("celsius:" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2 :
                    System.out.println("Enter in celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case  0 :
                    System.exit(0);

            }
        }while (choose != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
