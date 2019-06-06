package com.cmdb.web.mapper;

import java.util.List;

import com.cmdb.web.mapper.po.RoleMenu;

public interface RoleMenuMapper {
    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByRoleId(Integer roleId);
}