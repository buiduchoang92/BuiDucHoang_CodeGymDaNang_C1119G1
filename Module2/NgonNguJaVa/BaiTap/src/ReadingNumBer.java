import java.util.Scanner;
public class ReadingNumBer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("input number : ");
        number = sc.nextInt();
        int num = 0;
        int temp = 3;
        int temp1 = 0;
        while (number > 0) {
            if (number >= 100) {
                num = number / 100;
                number = number % 100;
                temp1 = 1;
                temp = 3;
                //  System.out.print("hundred");
            } else if (number >= 20) {
                num = number / 10;
                number = number % 10;
                temp1 = 2;
                temp--;
                // System.out.println("ty");
            } else if (number >= 16) {
                num = number % 10;
                number = number / 10;
                temp1 = 1;
                temp--;
                //System.out.print("teen");
            } else {
                num = number;
                number = -1;
                temp1 = 1;
                temp--;
            }
            switch (num) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    if (temp1 == 2)
                        System.out.print("twen");
                    else
                        System.out.print("two");
                    break;
                case 3:
                    if(temp1 == 2)
                        System.out.print("thir");
                    else
                        System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    if(temp1 == 2)
                        System.out.print("fift");
                    else
                        System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    number = -1;
                    continue;
                case 12:
                    System.out.print("twelve");
                    number = -1;
                    continue;
                case 13:
                    System.out.print("thirteen ");

                    number = -1;
                    continue;
                case 14:
                    System.out.print("fourteen ");
                    number = -1;
                    continue;
                case 15:
                    System.out.print("fifteen ");
                    number = -1;
                    continue;
            }
            if (temp == 3) {
                System.out.print("hundred ");
            } else if (temp == 2)
                System.out.print("ty ");
        }
    }
}