package com.jobmatcher.repository.Impl;

import com.jobmatcher.model.User;
import com.jobmatcher.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by gevlad on 8/11/2016.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Make a word managed and persistent.
     *
     * @param user
     */
    @Override
    public void save(User user) { entityManager.persist(user); }


}
