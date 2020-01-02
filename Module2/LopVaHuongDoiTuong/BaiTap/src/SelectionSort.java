import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
//        System.out.println("startTime: " + stopWatch.getStart() + "\n" + "stopTime: " + stopWatch.getStop()+"\n"+
//                stopWatch.getElapsedTime());
        stopWatch.getStart();
        int count = 1;
        for (int i = 0;i <100000;i++){
            count += count;
        }
        stopWatch.getStop();
        System.out.println("Sort: " + stopWatch.getElapsedTime() +"\n" + stopWatch.getStart());
    }
}
