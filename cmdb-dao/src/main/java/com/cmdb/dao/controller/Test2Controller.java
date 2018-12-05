package com.cmdb.dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.dao.entity.User;
import com.cmdb.dao.mapper.UserMapper;
@RestController
public class Test2Controller  {
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("selectById")
	public User selectById() {
		return userMapper.selectById("1");
	}

}
