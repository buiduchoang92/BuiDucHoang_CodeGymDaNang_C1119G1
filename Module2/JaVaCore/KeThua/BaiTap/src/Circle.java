public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString(){
        return "A Circle with Color of " + getColor() + " and Radius " + getRadius() +
                " and Area " + getArea();
    }

}
