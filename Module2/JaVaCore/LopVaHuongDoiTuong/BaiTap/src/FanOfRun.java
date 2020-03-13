import java.util.Scanner;

public class FanOfRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        Fan fan2 = new Fan();
        fan2.setColor("blue");
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println("speed= " + fan1.getFast() + "\n" + "color= " + fan1.getColor() + "\n" + "Radius= " + fan1.getRadius());
        System.out.println("speed= "+fan2.getFast() + "\n" +"color= "+ fan2.getColor() + "\n" + "Radius= "+fan2.getRadius());
    }
}
