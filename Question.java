/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author jesse
 */
public class Question {

    private String ques;
    private String option1, option2, option3, option4;
    private String ans;
    

    public Question(String ques, String option1, String option2, String option3, String option4, String ans) {
        this.ques = ques;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.ans = ans;
    }

    public Question() {
    }

    public String getQues() {
        return ques;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAns() {
        return ans;
    }

    
    public ArrayList<Question> setQues() {
        String path = "quiz_100_questions.txt";
        String line;
        String[] lines;
        int count = 0;
        ArrayList<Question> questions1 = new ArrayList<>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader(path));

            while ((line = buff.readLine()) != null) {
                lines = line.split(",");
                Question q = new Question(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5]);
                questions1.add(q);
            }
            Collections.shuffle(questions1);
        } catch (Exception e) {
            System.out.println(e);
        }

        return questions1;

    }
}
