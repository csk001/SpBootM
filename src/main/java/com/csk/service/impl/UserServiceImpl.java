package com.csk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csk.dao.mapper.UserMapper;
import com.csk.domain.UserInfo;
import com.csk.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserInfo query(String name) {
		return userMapper.queryUser(name);
	}

}
