package com.jobmatcher.service.Impl;

import com.jobmatcher.model.Job;
import com.jobmatcher.repository.JobRepository;
import com.jobmatcher.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gevlad on 19-Dec-16.
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    JobRepository jobRepository;

    @Override
    @Transactional
    public Job save(Job job) {
        return jobRepository.save(job);
    }

    @Override
    @Transactional
    public Job findById(long id) {
        return jobRepository.findOne(id);
    }

}
