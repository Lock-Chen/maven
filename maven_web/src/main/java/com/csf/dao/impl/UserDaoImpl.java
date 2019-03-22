package com.csf.dao.impl;

import com.csf.dao.UserDao;
import com.csf.domain.User;
import com.csf.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public List<User> findAll(){
        //定义sql语句
        String sql = "select * from user";
        //执行sql语句
        List<User> list = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        return list;
    }
}
