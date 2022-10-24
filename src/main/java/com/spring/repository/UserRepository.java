package com.spring.repository;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRepository <User, Long>{

    Iterable findAll();

    Map<Object, Object> findById(java.lang.Long id);

    void save(com.spring.entity.User user);

    void deleteById(java.lang.Long id);
}