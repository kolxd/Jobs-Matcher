package com.jobmatcher.service.Impl;

import com.jobmatcher.utility.Impl.CVParser;
import com.jobmatcher.Service.MainService;
import com.jobmatcher.service.UploadCVService;
import com.jobmatcher.service.UploadLinkedinService;
import com.jobmatcher.utility.Impl.LinkedinParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpHeaders.USER_AGENT;

/**
 * Created by gevlad on 08-Jan-17.
 */
@Service
public class MainServiceImpl implements com.jobmatcher.Service.MainService {

    @Autowired
    UploadCVService uploadCVService;

    @Autowired
    UploadLinkedinService uploadLinkedinService;



    public String getJobFromAuthenticJobs(String key) {

        String url = "https://authenticjobs.com/api/?api_key=d3bc95973199abbd28fd6b587e09645d&method=aj.jobs.search&keywords=java,mysql&format=json&perpage=1";

        URL obj = null;
        StringBuffer response = new StringBuffer();
        try {
            obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;


            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //print result
            System.out.println(response.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response.toString();
    }

    public String getKeyWordsFromCVFile(String filePath){

        List<String> keyWords = new ArrayList<>();
        keyWords.addAll(CVParser.parseFile(filePath));
        String key = "";

        for (String s : keyWords) {
            key += s + ",";
        }
        key = key.substring(0, key.length()-1);
        System.out.println(key + "\n");
        return key;
    }

    public String getKeyWordsFromLinkedinFile(String filePath){

        List<String> keyWords = LinkedinParser.parseFile(filePath);
        String key = "";

        for (String s : keyWords) {
            key += s + ",";
        }
        key = key.substring(0, key.length()-1);
        return key;
    }

}