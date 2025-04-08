/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APIs;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author jesse
 */
public class Test {

    public static void main(String[] args) {
        JSONObject json = new JSONObject();

        JSONArray questions = json.getJSONArray("results");

        for (int i = 0; i < questions.length(); i++) {
            JSONObject question = questions.getJSONObject(i);
            System.out.println(question.getString("questions"));
        }
    }
}
