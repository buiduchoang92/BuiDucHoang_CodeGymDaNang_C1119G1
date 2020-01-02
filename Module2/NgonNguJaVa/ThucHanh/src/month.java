import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2 :
                //System.out.print("thang 2 co 28 hoac 29 ngay.");
                daysInMonth = "28 or 29";
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                //System.out.print("the month " + month + "has 31 day");
                daysInMonth = "31";
                break;
            case 4 :
            case 6 :
            case 9 :
                daysInMonth = "30";
                //System.out.print("the month " + month + "has 30 day");
                break;
            default:
                //System.out.println("Invalid input!");
                daysInMonth = "";
                break;
        }
        if (daysInMonth != "") System.out.printf("The month %d has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
