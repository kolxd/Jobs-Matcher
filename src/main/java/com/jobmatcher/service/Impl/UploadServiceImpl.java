package com.jobmatcher.service.Impl;

/**
 * Created by gevlad on 19-Dec-16.
 */

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import com.jobmatcher.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by mneata on 8/12/2016.
 */
@Service
public class UploadServiceImpl implements UploadService {


    /**
     * Saves a file on disk and return the path to it
     *
     * @param file - a file that should contain one title on each line
     * @return - the path of the file
     */
    @Override
    public String save(MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                Files.copy(file.getInputStream(), Paths.get(PATH, file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

                return PATH + "\\" + file.getOriginalFilename();
            } catch (IOException e) {
                System.out.println(e.getStackTrace());
            }

        }
        return "Error";
    }
}
