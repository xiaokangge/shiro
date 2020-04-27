package com.shiro.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiro.demo.mapper.UserMapper;
import com.shiro.demo.service.UserService;
import com.shiro.demo.vo.User;

@Service
public class UserServiceImpl implements UserService {

	 //注入Mapper接口
    @Autowired
    private UserMapper userMapper;
	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.findByName(name);
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}

}
