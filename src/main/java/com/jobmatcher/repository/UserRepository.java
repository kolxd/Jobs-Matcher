package com.jobmatcher.repository;

import com.jobmatcher.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gevlad on 14-Dec-16.
 */

public interface UserRepository{

    void save(User user);

}
