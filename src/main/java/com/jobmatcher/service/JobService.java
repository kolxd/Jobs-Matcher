package com.jobmatcher.service;

import com.jobmatcher.model.Job;

/**
 * Created by gevlad on 19-Dec-16.
 */
public interface JobService {
    Job save(Job job);

    Job findById(long id);

}
