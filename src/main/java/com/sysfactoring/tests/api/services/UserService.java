package com.sysfactoring.tests.api.services;

import com.sysfactoring.tests.api.domain.User;
import com.sysfactoring.tests.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
