package com.jikejishu.dao;

import com.jikejishu.model.User;

public interface UserMapper {

    User selectByPrimaryKey(int userId);

    User findByUser(User user);

}