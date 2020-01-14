package CheckComparable;

import CheckResizeable.Cricle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle("blue",false,3.5);
        System.out.println("truoc khi soft:");
        for (Cricle cricle : circles){
            System.out.println(cricle);
        }
        Arrays.sort(circles);
        for (Cricle cricle : circles){
            System.out.println(cricle);
        }
    }
}
