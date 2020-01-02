import java.util.Scanner;

public class ReadingNumBer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter NumBer: ");
        int number = scanner.nextInt();
        String datamain= "";
        String datamain1 = "";
        String datamain2 = "";
        String datamain3 = "";
        int number3 = number / 100;
        int number1 = number % 10;
        int number2 = number /10;
                switch (number1) {
                case 0:
                    datamain = "zero";
                    break;
                case 1:
                    datamain = "one";
                    break;
                case 2:
                    datamain = "tow";
                    break;
                case 3:
                    datamain = "three";
                    break;
                case 4:
                    datamain = "for";
                    break;
                case 5:
                    datamain = "five";
                    break;
                case 6:
                    datamain = "six";
                    break;
                case 7:
                    datamain = "seveen";
                    break;
                case 8:
                    datamain = "eight";
                    break;
                case 9:
                    datamain = "night";
                    break;
            }
            switch (number2) {
                case 2:
                    datamain2 = "twenty";
                    break;
                case 3:
                    datamain2 = "thirty";
                    break;
                case 4:
                    datamain2 = "forty";
                    break;
                case 5:
                    datamain2 = "fifty";
                    break;
                case 6:
                    datamain2 = "sixty";
                    break;
                case 7:
                    datamain2 = "seventy";
                    break;
                case 8:
                    datamain2 = "eigthty";
                    break;
                case 9:
                    datamain2 = "nigthty";
                    break;
            }
        switch (number3){
            case 1:
               datamain3 = "onehundred";
                break;
            case 2:
                datamain3 = "towhundred";
                break;
            case 3:
                datamain3 = "threehundred";
                break;
            case 4:
                datamain3 = "forhundred";
                break;
            case 5:
                datamain3 = "fivehundred";
                break;
            case 6:
                datamain3 = "sixhundred";
                break;
            case 7:
                datamain3 = "sevenhundred";
                break;
            case 8:
                datamain3 = "eigthhundred";
                break;
            case 9:
                datamain3 = "nigthhundred";
                break;
        }
        System.out.printf("so %d la %s%s%s" ,number,datamain2,datamain1,datamain,datamain3);
    }
}
