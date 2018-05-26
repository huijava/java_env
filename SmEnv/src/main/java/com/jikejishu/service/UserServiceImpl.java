package com.jikejishu.service;

import com.jikejishu.dao.UserMapper;
import com.jikejishu.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	private static Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	public User getUserInfoById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public User getUserInfo(int gender, int age) {
		User user = new User();
		user.setGender(1);
		user.setAge(28);
		return userMapper.findByUser(user);
	}
}
