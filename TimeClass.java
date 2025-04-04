/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

import java.io.*;

/**
 *
 * @author jesse
 */
public class TimeClass implements Time {

    int hour, min, sec, milisec;
    int hoursInMin;
    long minInSec;
    long inMili;
    long compared;

    public TimeClass(int hour, int min, int sec, int milisec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.milisec = milisec;
    }

    public TimeClass() {

    }

    @Override
    public int getHH() {
        return hour;
    }

    @Override
    public int getMM() {
        return min;
    }

    @Override
    public int getSS() {
        return sec;
    }

    @Override
    public int getMS() {
        return milisec;
    }

    @Override
    public void setHH(int hh) {
        this.hour = hh;
    }

    @Override
    public void setMM(int mm) {
        this.min = mm;
    }

    @Override
    public void setSS(int ss) {
        this.sec = ss;
    }

    @Override
    public void setMS(int ms) {
        this.milisec = ms;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.hour;
        hash = 67 * hash + this.min;
        hash = 67 * hash + this.sec;
        hash = 67 * hash + this.milisec;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TimeClass other = (TimeClass) obj;
        if (this.hour != other.hour) {
            return false;
        }
        if (this.min != other.min) {
            return false;
        }
        if (this.sec != other.sec) {
            return false;
        }
        return this.milisec == other.milisec;
    }

    public void compare(TimeClass thing) {
        this.hoursInMin = this.hour * 60;
        thing.hoursInMin = thing.hour * 60;
        this.minInSec = this.min + this.hoursInMin * 60;
        thing.minInSec = thing.min + thing.hoursInMin * 60;
        this.inMili = this.minInSec + this.sec * 1000;
        thing.inMili = thing.minInSec + thing.sec * 1000;
        this.compared = this.inMili + this.milisec;
        thing.compared = thing.inMili + thing.milisec;

    }

    public long getTime() {
        compared = this.hour * 3600000 + this.min * 60000 + this.sec * 1000;
        return compared;
    }

    public TimeClass getTime(long time) {
        long fromHours;
        long fromMin;
        long fromSec;
        long fromMiliSec;

        fromHours = time / (1000 * 60 * 60);
        long remainMsAfterHours = time % (1000 * 60 * 60);

        fromMin = remainMsAfterHours / (1000 * 60);
        long remainMsAfterMin = remainMsAfterHours % (1000 * 60);

        fromSec = remainMsAfterMin / 1000;
        long remainMilisecs = remainMsAfterMin % 1000;

        TimeClass time1 = new TimeClass(((int) fromHours), (int) fromMin, (int) fromSec, (int) remainMilisecs);
        return time1;
    }
   public int getTimeInMS() {
       return milisec; 
    }
}
