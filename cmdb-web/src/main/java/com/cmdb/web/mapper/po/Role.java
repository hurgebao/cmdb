package com.cmdb.web.mapper.po;

import java.util.Date;

public class Role {
	/**
	 * 角色编号
	 */
	private Integer roleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 资金池编号
	 */
	private Long fundPoolCode;

	/**
	 * 是否可删除 0否 1是
	 */
	private Boolean enableDelete;

	/**
	 * 是否可编辑 0否 1是
	 */
	private Boolean enableEdit;

	/**
	 * 角色类别 1平台管理员 2平台操作员3机构管理员4机构操作员
	 */
	private String roleType;

	/**
	 * 角色状态 0启用 1禁用
	 */
	private String roleStatus;

	/**
	 * 操作员编号
	 */
	private Long operator;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 角色编号
	 * 
	 * @return role_id 角色编号
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * 角色编号
	 * 
	 * @param roleId 角色编号
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * 角色名称
	 * 
	 * @return role_name 角色名称
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 角色名称
	 * 
	 * @param roleName 角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	/**
	 * 资金池编号
	 * 
	 * @return fund_pool_code 资金池编号
	 */
	public Long getFundPoolCode() {
		return fundPoolCode;
	}

	/**
	 * 资金池编号
	 * 
	 * @param fundPoolCode 资金池编号
	 */
	public void setFundPoolCode(Long fundPoolCode) {
		this.fundPoolCode = fundPoolCode;
	}

	/**
	 * 是否可删除 0否 1是
	 * 
	 * @return enable_delete 是否可删除 0否 1是
	 */
	public Boolean getEnableDelete() {
		return enableDelete;
	}

	/**
	 * 是否可删除 0否 1是
	 * 
	 * @param enableDelete 是否可删除 0否 1是
	 */
	public void setEnableDelete(Boolean enableDelete) {
		this.enableDelete = enableDelete;
	}

	/**
	 * 是否可编辑 0否 1是
	 * 
	 * @return enable_edit 是否可编辑 0否 1是
	 */
	public Boolean getEnableEdit() {
		return enableEdit;
	}

	/**
	 * 是否可编辑 0否 1是
	 * 
	 * @param enableEdit 是否可编辑 0否 1是
	 */
	public void setEnableEdit(Boolean enableEdit) {
		this.enableEdit = enableEdit;
	}

	/**
	 * 角色类别 0管理员 1操作员
	 * 
	 * @return role_type 角色类别 0管理员 1操作员
	 */
	public String getRoleType() {
		return roleType;
	}

	/**
	 * 角色类别 0管理员 1操作员
	 * 
	 * @param roleType 角色类别 0管理员 1操作员
	 */
	public void setRoleType(String roleType) {
		this.roleType = roleType == null ? null : roleType.trim();
	}

	/**
	 * 角色状态 0启用 1禁用
	 * 
	 * @return role_status 角色状态 0启用 1禁用
	 */
	public String getRoleStatus() {
		return roleStatus;
	}

	/**
	 * 角色状态 0启用 1禁用
	 * 
	 * @param roleStatus 角色状态 0启用 1禁用
	 */
	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus == null ? null : roleStatus.trim();
	}

	/**
	 * 操作员编号
	 * 
	 * @return operator 操作员编号
	 */
	public Long getOperator() {
		return operator;
	}

	/**
	 * 操作员编号
	 * 
	 * @param operator 操作员编号
	 */
	public void setOperator(Long operator) {
		this.operator = operator;
	}

	/**
	 * 创建时间
	 * 
	 * @return create_time 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间
	 * 
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 更新时间
	 * 
	 * @return update_time 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新时间
	 * 
	 * @param updateTime 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}