package com.shiro.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shiro.demo.vo.User;
@Mapper
public interface UserMapper {

	 public User findByName(String name);
	    
	    public User findById(Integer id);
}
