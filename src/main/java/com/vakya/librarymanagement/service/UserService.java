package com.vakya.librarymanagement.service;

import com.vakya.librarymanagement.model.User;

public interface UserService {
    void register(User user);
    boolean validate(User user);
}
