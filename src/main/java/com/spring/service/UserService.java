package com.spring.service;

import com.spring.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> showUsers();

    void deleteUserById(int id);

    User getUserById(int id);

    void updateUser(User userToUpdate);
}