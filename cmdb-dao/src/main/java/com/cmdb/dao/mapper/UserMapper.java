package com.cmdb.dao.mapper;

import com.cmdb.dao.entity.User;

public interface UserMapper {
	User selectById(String id);
}
