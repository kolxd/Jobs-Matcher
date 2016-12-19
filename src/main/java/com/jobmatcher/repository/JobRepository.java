package com.jobmatcher.repository;

import com.jobmatcher.model.Job;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gevlad on 14-Dec-16.
 */

public interface JobRepository extends CrudRepository<Job, Long> {


}
