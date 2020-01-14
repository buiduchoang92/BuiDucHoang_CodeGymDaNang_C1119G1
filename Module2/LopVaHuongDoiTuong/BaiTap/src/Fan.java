public class Fan {
    final int Slow = 1,Medium =2,Fast =3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        if (isOn()){
            return " Fan is on{" + "speed" + speed + ",radius=" + radius + ",color=" + color+"}";
        }else {
            return "Fan is off{" + "radius=" + radius + ",color=" + color + "}";
        }
//        return "Fan{" +
//                "Slow=" + Slow +
//                ", Medium=" + Medium +
//                ", Fast=" + Fast +
//                ", speed=" + speed +
//                ", on=" + on +
//                ", radius=" + radius +
//                ", color='" + color + '\'' +
//                '}';
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

    public Fan() {
    }
}

