package com.cmdb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.web.feign.ExecutorFeignClient;
import com.cmdb.web.mapper.RoleMapper;
import com.cmdb.web.mapper.RoleMenuMapper;
import com.cmdb.web.mapper.po.Role;
import com.cmdb.web.mapper.po.RoleMenu;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="角色管理")
@RestController
@RequestMapping("role")
public class RoleController {
	@Autowired
	private ExecutorFeignClient executorFeignClient;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private RoleMenuMapper roleMenuMapper;
	@GetMapping("hello")
	@ApiOperation("测试")
	public String hello() {
		return executorFeignClient.hello();
	}
	@GetMapping("getRole/{id}")
	@ApiOperation("按id查询")
	public Role getRole(@PathVariable("id")Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}
	@GetMapping("getRoleMenu/{id}")
	@ApiOperation("按id查询")
	public List<RoleMenu> getRoleMenu(@PathVariable("id")Integer id) {
		return roleMenuMapper.selectByRoleId(id);
	}
}
