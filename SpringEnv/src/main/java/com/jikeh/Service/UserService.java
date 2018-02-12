package com.jikeh.Service;

import com.jikeh.Dao.UserDao;

public class UserService {

    public UserDao userDao;

    public void getUserInfo(){
        System.out.println(userDao.getUser());
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
