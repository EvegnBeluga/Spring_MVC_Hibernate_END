package com.spring.service;

import com.spring.entity.User;
import com.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private UserRepository repository;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }
    @Override
    public List getAllUsers() {
        List<Object> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public User getUserById(Long id) {
        return (User) repository.findById(id).get(id);
    }

    @Override
    public boolean saveUser(User user) {
        try {
            repository.save(user);
            return true;
        }catch(Exception ex) {
            return false;
        }
    }

    @Override
    public boolean deleteUserById(Long id) {
        try {
            repository.deleteById(id);
            return true;
        }catch(Exception ex) {
            return false;
        }

    }

}
