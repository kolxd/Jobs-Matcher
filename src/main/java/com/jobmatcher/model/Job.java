package com.jobmatcher.model;

import javax.persistence.*;

/**
 * Created by gevlad on 14-Dec-16.
 */

@Entity
@Table(name = "job")
public class Job {
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String jobDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
