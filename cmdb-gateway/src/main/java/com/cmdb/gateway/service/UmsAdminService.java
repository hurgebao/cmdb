package com.cmdb.gateway.service;

import java.util.List;

import com.cmdb.gateway.model.UmsAdmin;
import com.cmdb.gateway.model.UmsPermission;

public interface UmsAdminService {

	UmsAdmin getAdminByUsername(String username);

	List<UmsPermission> getPermissionList(Object id);

	UmsAdmin register(UmsAdmin umsAdminParam);

	String login(String username, String password);

}
