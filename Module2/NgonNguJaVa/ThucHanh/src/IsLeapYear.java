import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Nam: ");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " La Nam Nhuan.");
                }else {
                    System.out.println(year + "khong phai la nam nhuan.");
                }
            }else {
                System.out.println(year + "la nam nhuan.");
            }
        }else {
            System.out.println(year + "khong phai nam nhuan.");
        }
    }
}