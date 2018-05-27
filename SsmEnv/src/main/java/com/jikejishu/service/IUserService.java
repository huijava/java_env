package com.jikejishu.service;

import com.jikejishu.model.User;

public interface IUserService {

    public User getUserInfoById(int id);

    public User getUserInfo(int gender, int age);

}
