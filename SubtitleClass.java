/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

/**
 *
 * @author jesse
 */
public class SubtitleClass implements Subtitle {

    Time startTime;
    Time endTime;
    String text;
//    int compared;

    public SubtitleClass(TimeClass startTime, TimeClass endTime, String text) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.text = text;
    }

    public SubtitleClass() {
    }

    @Override
    public Time getStartTime() {
        return startTime;
    }

    @Override
    public Time getEndTime() {
        return endTime;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

}
