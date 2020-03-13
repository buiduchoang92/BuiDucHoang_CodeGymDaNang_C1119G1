public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float arr[] = new float[2];
        arr[0] = this.getX();
        arr[1] = this.getY();
        return arr;
    }
    public void setXY(float X,float Y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String result ="";
        for (float item : getXY()) {
            result += item;
        }
        return "Point2D{" +
                "x=" + x + result +
                ", y=" + y +
                '}';
    }
}
