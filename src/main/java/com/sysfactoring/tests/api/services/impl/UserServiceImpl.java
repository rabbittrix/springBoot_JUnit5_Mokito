package com.sysfactoring.tests.api.services.impl;

import com.sysfactoring.tests.api.domain.User;
import com.sysfactoring.tests.api.repositories.UserRepository;
import com.sysfactoring.tests.api.services.UserService;
import com.sysfactoring.tests.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
