public class StopWatch {
    private double startTime,endTime;
    public StopWatch(double startTime,double endTime){
       this.startTime = startTime;
       this.endTime = endTime;
    }

    public StopWatch() {
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
    public double getStart(){
        return startTime = System.currentTimeMillis();
    }
    public double getStop(){
        return  endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
