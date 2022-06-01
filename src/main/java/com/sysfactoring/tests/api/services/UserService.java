package com.sysfactoring.tests.api.services;

import com.sysfactoring.tests.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
