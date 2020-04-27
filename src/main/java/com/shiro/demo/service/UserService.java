package com.shiro.demo.service;

import com.shiro.demo.vo.User;

public interface UserService {

	 public User findByName(String name);
	    
	    public User findById(Integer id);
}
