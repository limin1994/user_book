package com.gloudtek.entity;


import java.io.Serializable;

//用户与角色对应关系
public class SysUserRoleEntity implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	private Long id;

	//用户ID
	private Long userId;

	//角色ID
	private Long roleId;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return roleId;
	}
	
}
