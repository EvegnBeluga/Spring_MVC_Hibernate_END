package com.spring.service;

import com.spring.entity.User;

import java.util.List;

public interface UserService {

    public List getAllUsers();
    public User getUserById(Long id);
    public boolean saveUser(User user);
    public boolean deleteUserById(Long id);

}