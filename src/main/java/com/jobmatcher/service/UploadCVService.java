package com.jobmatcher.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by gevlad on 15-Jan-17.
 */
public interface UploadCVService {

    String PATH = "D:\\Facultate\\Jobs-Matcher\\uploadCV";

    String save(MultipartFile file);
}
