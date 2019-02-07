package com.thapa.jwt.service;

import com.thapa.jwt.entity.UserDetails;

import java.util.List;

public interface UserService {

    void insert(UserDetails userDetails);

    Boolean search(String firstname, String password);

    List<UserDetails> getAll();
}
