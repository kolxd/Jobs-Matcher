package com.jobmatcher;

import com.jobmatcher.service.UploadService;
import javafx.application.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class WebAppInitializer extends SpringBootServletInitializer {

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
        }

public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        }

@Bean
CommandLineRunner init() {
        return (args) -> {
        FileSystemUtils.deleteRecursively(new File(UploadService.PATH));

        Files.createDirectory(Paths.get(UploadService.PATH));
        };
        }
        }