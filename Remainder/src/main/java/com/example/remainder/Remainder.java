package com.example.remainder;

import static java.lang.Integer.*;

public class Remainder {
    private String houre;
    private String date;
    private String amPm;
    private String minute;

    public Remainder(){
        this.houre=null;
        this.minute=null;
        this.date=null;
        this.amPm=null;
    }

    public Remainder(String houre,String minute, String date, String amPm) {
        this.houre = houre;
        this.minute=minute;
        this.date = date;
        this.amPm = amPm;
    }

    public String getHoure() {
        return houre;
    }

    public void setHoure(String houre) {
        this.houre = houre;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmPm() {
        return amPm;
    }

    public void setAmPm(String amPm) {
        this.amPm = amPm;
    }
    public String checkAMPM(String remainderHoure,String remainderAMPM) {
        String Houre=null;
        if (remainderAMPM.equals("PM")) {
            Houre =String.valueOf ((12 + parseInt(remainderHoure)));
        }
        return Houre;
    }
    public void remainder(String remainderHoure, String remainderMinute){
        if(remainderHoure.equals(this.houre)&& remainderMinute.equals(this.minute)){
            System.out.println("Alarm");
        }
    }
}
