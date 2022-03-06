package Ss4.Class.BaiTap;

import java.util.Date;

public class StopWatchClass {
    private int startTime;

    private int endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public StopWatchClass(){
        this.startTime = (int) new Date().getTime();
    }

}
