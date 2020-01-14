public class Cylinder extends Circle {
    private double heigth;

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume() {
        return Math.pow(getRadius(), 2) * this.heigth * Math.PI;
    }

    @Override
    public String toString() {
        return "A volume with of" + getVolume() + ",the heigth: " + getHeigth() +
                super.toString();
    }
}
