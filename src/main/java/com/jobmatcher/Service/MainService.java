package com.jobmatcher.service;

/**
 * Created by gevlad on 08-Jan-17.
 */
public interface MainService {

    String getJobFromAuthenticJobs(String key);
    String getKeyWordsFromCVFile(String filePath);
    String getKeyWordsFromLinkedinFile(String filePath);
}
