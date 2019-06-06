package com.cmdb.web.mapper.po;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class RoleMenu implements Serializable {
    /**
     *	角色编号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value="角色编号")
    private Integer roleId;

    /**
     *	菜单编号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value="菜单编号")
    private String menuId;

    /**
     *	创建人编号
     *
     * @mbggenerated
     */
    @ApiModelProperty(value="创建人编号")
    private Long operatorNo;

    /**
     *	创建时间
     *
     * @mbggenerated
     */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     *	更新时间
     *
     * @mbggenerated
     */
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public Long getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(Long operatorNo) {
        this.operatorNo = operatorNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}