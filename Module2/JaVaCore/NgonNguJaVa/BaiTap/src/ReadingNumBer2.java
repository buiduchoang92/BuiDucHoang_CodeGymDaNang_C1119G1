import java.util.Scanner;

public class ReadingNumBer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int num = 0 , temp = 3, temp1 = 0;
        System.out.println("EnterNumber: ");
        while (number > 0){
            if (number >= 100){
                num = number / 100;
                number = number % 100;
                temp1 = 1;
                temp = 3;
            }else if (number >=20){
                num = number / 10;
                number = number % 10;
                temp1 = 2;
                temp--;
            }else if (number >=16){
                num
            }
        }
    }
}
