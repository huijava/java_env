package com.jikeh.Dao;

import com.jikeh.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getUser(){
        String userName = this.jdbcTemplate.queryForObject(
                "select userName from user where id = ?",
                new Object[]{1L}, String.class);
        return userName;
    }

}
