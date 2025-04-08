/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APIs;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author jesse
 */
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;

public class Start {

    public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();

            HttpGet httpget = new HttpGet("https://opentdb.com/api.php");

            URI uri = new URIBuilder(httpget.getURI())
                    .addParameter(" amount", "10")
                    .addParameter("difficulty", "easy")
                    .build();
            httpget.setURI(uri);

            ResponseHandler<String> responsehandler = (org.apache.http.HttpResponse hr) -> {
                int status = hr.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = hr.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("wrong" + status);
                }
            };
            String responseBody = "";
            responseBody = httpClient.execute(httpget, responsehandler);
//            System.out.println(responseBody);

            JSONObject json = new JSONObject(responseBody);

            JSONArray questions = json.getJSONArray("results");

            for (int i = 0; i < questions.length(); i++) {
                JSONObject question = questions.getJSONObject(i);
                System.out.println(question.getString("question"));
            }
        } catch (Exception e) {

        }
    }
}
