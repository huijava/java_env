package com.jikeh.Service;

import com.jikeh.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    public void getUserInfo(){
        System.out.println(userDao.getUser());
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
