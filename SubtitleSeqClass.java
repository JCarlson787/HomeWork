/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

import java.util.*;

/**
 *
 * @author jesse
 */
public class SubtitleSeqClass implements SubtitleSeq {

    List<Subtitle> subtitles;

    public SubtitleSeqClass() {
        subtitles= new ArrayList<>();
    }

    public SubtitleSeqClass(List<Subtitle> subtitles) {
        this.subtitles = subtitles;
    }

    @Override
    public void addSubtitle(Subtitle st) {
        subtitles.add(st);
    }

    @Override
    public List<Subtitle> getSubtitles() {
        return subtitles;
    }

    @Override
    public Subtitle getSubtitle(Time time) {
        TimeClass t = (TimeClass) time;
        for (Subtitle subtitle : subtitles) {
            if (subtitle.getStartTime().equals(time)) {
                return subtitle;
            }
        }
        return null;
    }

    @Override
    public List<Subtitle> getSubtitles(Time startTime, Time endTime) {
        TimeClass sT = (TimeClass) startTime;
        TimeClass eT = (TimeClass) endTime;
       
        List<Subtitle> subList = new ArrayList<>();
        for (Subtitle subtitle : subtitles) {
             TimeClass start = (TimeClass) subtitle.getStartTime();
             TimeClass end = (TimeClass) subtitle.getEndTime();
            if (start.getTime() > sT.getTime() && end.getTime() < eT.getTime()) {
                subList.add(subtitle);
            }
        }
        return subList;
    }

    @Override
    public List<Subtitle> getSubtitles(String str) {
        String subtitleText;
        List<Subtitle> subtitlesWanted = new ArrayList<>();
        for (int i = 0; i < subtitles.size(); i++) {
            subtitleText = subtitles.get(i).getText();
            if(subtitleText.contains(str)){
                subtitlesWanted.add(subtitles.get(i));
            }
        }
        return subtitlesWanted;
    }

    @Override
    public void remove(String str) {
        for (Subtitle subtitle : subtitles) {
            if (subtitle.getText().equals(str)) {
                subtitle.setText("");
            }
        }
    }

    @Override
    public void replace(String str1, String str2) {
        for (Subtitle subtitle : subtitles) {
            if (subtitle.getText().contains(str1)) {
                subtitle.setText(str2);
            }
        }
    }

    @Override
    public void shift(int offset) {
        long plusMinus;
        for (Subtitle subtitle : subtitles) {
            if (offset < 0) {
                TimeClass start = (TimeClass) subtitle.getStartTime();
                plusMinus = start.getTime() - offset;

                subtitle.setStartTime(new TimeClass().getTime(plusMinus));
                subtitle.setEndTime(new TimeClass().getTime(plusMinus));
            } else if (offset > 0) {
                TimeClass start = (TimeClass) subtitle.getStartTime();
                plusMinus = start.getTime() + offset;
                subtitle.setStartTime(new TimeClass().getTime(plusMinus));
                subtitle.setEndTime(new TimeClass().getTime(plusMinus));
            }
        }
    }

    @Override
    public void cut(Time startTime, Time endTime) {
        TimeClass sT = (TimeClass) startTime;
        TimeClass eT = (TimeClass) endTime;

        for (Subtitle subtitle : subtitles) {
            TimeClass start = (TimeClass) subtitle.getStartTime();
            TimeClass end = (TimeClass) subtitle.getEndTime();
            if (start.getTime() > sT.getTime() && end.getTime() < eT.getTime()) {
                subtitle.setText("");
            }
            
            
        }
    }
}
