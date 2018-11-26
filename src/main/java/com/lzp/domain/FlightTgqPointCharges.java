package com.lzp.domain;

public class FlightTgqPointCharges {
    private Integer time;
    private  String timeText;
    private  Integer returnFee;
    private  Integer changeFee;
    private String cabinCount;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getTimeText() {
        return timeText;
    }

    public void setTimeText(String timeText) {
        this.timeText = timeText;
    }

    public Integer getReturnFee() {
        return returnFee;
    }

    public void setReturnFee(Integer returnFee) {
        this.returnFee = returnFee;
    }

    public Integer getChangeFee() {
        return changeFee;
    }

    public void setChangeFee(Integer changeFee) {
        this.changeFee = changeFee;
    }

    public String getCabinCount() {
        return cabinCount;
    }

    public void setCabinCount(String cabinCount) {
        this.cabinCount = cabinCount;
    }
}
