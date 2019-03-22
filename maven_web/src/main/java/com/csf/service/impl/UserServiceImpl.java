package com.csf.service.impl;

import com.csf.dao.UserDao;
import com.csf.dao.impl.UserDaoImpl;
import com.csf.domain.User;
import com.csf.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        UserDao dao = new UserDaoImpl();
        List<User> list = dao.findAll();

        return list;
    }
}
