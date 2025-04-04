/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

import java.io.*;
import java.util.*;

/**
 *
 * @author jesse
 */
public class SubtitleSeqFactory {

    static SubtitleSeq seq;

    // Return an empty subtitles sequence 
    public static SubtitleSeq getSubtitleSeq() {
        return seq;
    }

    // Load a subtitle sequence from an SRT file. If the file does not exist or is corrupted (incorrect format), null is returned. 
    public static SubtitleSeq loadSubtitleSeq(String fileName) {
        seq = new SubtitleSeqClass();
        String line;
        ArrayList<String> allLines = new ArrayList<>();
        String[] lines;
        String[] startTimes;
        String[] endTimes;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(fileName));

            while ((line = buff.readLine()) != null) {
//                while (!line.equals("")) {
                String time = buff.readLine();
                
                String text="";
                String subtitle="";
               do{
                    subtitle=buff.readLine();
                     text +=subtitle;
                } while (!subtitle.equals(""));

//               text=text.trim();

//              
                    
//                  00:50:42,456 --> 00:50:44,040
                    String[] times = time.split(" --> ");
                    int[] st = convertTime(times[0]);   //convertTime("00:50:42,456")             
                    int[] et = convertTime(times[1]); //  convertTime("00:50:44,040");

                    TimeClass start = new TimeClass(st[0],st[1],st[2],st[3]);
                    TimeClass end = new TimeClass(et[0],et[1],et[2],et[3]);
                    SubtitleClass sub = new SubtitleClass(start, end, text);
                    seq.addSubtitle(sub);
//                }

            }

        } catch (Exception e) {

        }
        return seq;
    }
 public static int[] convertTime(String time) {
     //00:50:42,456
     
     String[] startTimes = time.split(":");
     String[] startTimes2 = startTimes[2].split(",");
     int[] response = {Integer.valueOf(startTimes[0]), Integer.valueOf(startTimes[1]), Integer.valueOf(startTimes2[0]), Integer.valueOf(startTimes2[1])};
     return response;
 }
    public static void main(String[] args) {
        SubtitleSeq subtitleSeq = SubtitleSeqFactory.loadSubtitleSeq("The.Chosen.2017.S01E01.srt");

        System.out.println(subtitleSeq.getSubtitles().size());
    }
}
