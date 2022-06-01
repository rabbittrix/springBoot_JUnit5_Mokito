package com.sysfactoring.tests.api.services;

import com.sysfactoring.tests.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
