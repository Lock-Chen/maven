package com.csf.dao;

import com.csf.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();
}
