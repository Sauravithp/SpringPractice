package com.thapa.jwt.service.serviceimpl;

import com.thapa.jwt.entity.UserDetails;
import com.thapa.jwt.repository.UserRepository;
import com.thapa.jwt.service.UserService;
import com.thapa.jwt.utility.QueryCreater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @PersistenceContext(unitName = "persistence")
    private EntityManager entityManager;

    public void insert(UserDetails userDetails) {
        userRepository.save(userDetails);
    }

    public Boolean search(String firstname, String password) {
        Query query1 = entityManager.createQuery(QueryCreater.queryToFetchUserDetailsByFirstName(firstname));
        List<UserDetails> userDetails = query1.getResultList();

        if (userDetails != null)
            return true;

        return false;
    }

    public List<UserDetails> getAll() {
        return userRepository.findAll();
    }

}

