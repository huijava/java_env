package com.jikejishu.service;

import com.jikejishu.dao.UserMapper;
import com.jikejishu.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	public User getUserInfoById(int id) {
		LOGGER.info("info级别");
		return userMapper.selectByPrimaryKey(id);
	}

	public User getUserInfo(int gender, int age) {
		LOGGER.info("info级别");
		User user = new User();
		user.setGender(1);
		user.setAge(28);
		return userMapper.findByUser(user);
	}
}
