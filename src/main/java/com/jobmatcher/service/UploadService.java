package com.jobmatcher.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by gevlad on 19-Dec-16.
 */
public interface UploadService {
    public String PATH = "uploads";

    String save(MultipartFile file);
}
