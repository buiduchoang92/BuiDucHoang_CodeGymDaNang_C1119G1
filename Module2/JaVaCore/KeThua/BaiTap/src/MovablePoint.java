public class MovablePoint extends Point {
    private float xSpeep = 0.0f;
    private float ySpeep = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeep, float ySpeep) {
        this.xSpeep = xSpeep;
        this.ySpeep = ySpeep;
    }

    public MovablePoint(float x, float y, float xSpeep, float ySpeep) {
        super(x, y);
        this.xSpeep = xSpeep;
        this.ySpeep = ySpeep;
    }

    public float getxSpeep() {
        return xSpeep;
    }

    public void setxSpeep(float xSpeep) {
        this.xSpeep = xSpeep;
    }

    public float getySpeep() {
        return ySpeep;
    }

    public void setySpeep(float ySpeep) {
        this.ySpeep = ySpeep;
    }
//    public float[] getSpeep(){
////        final [] = new float[3];
//    }
    public void setSpeep(float xSpeep,float ySpeep){
        this.xSpeep = xSpeep;
        this.ySpeep = ySpeep;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeep=" + xSpeep +
                ", ySpeep=" + ySpeep +
                getX() + getY() +
                '}';
    }
}
