package ss3_oop.exercise.watch;


import java.time.LocalTime;

public class StopWatch {
    long startTime;
    long endTime;

    public long start() {
       return this.startTime = System.currentTimeMillis();
    }
    public long end(){
        return this.endTime = System.currentTimeMillis();
    }


    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
}



