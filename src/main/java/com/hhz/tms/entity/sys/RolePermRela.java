/**
 * 
 */
package com.hhz.tms.entity.sys;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hhz.tms.entity.IdEntity;

/**
 * @author huangjian
 * 
 */
@Entity
@Table(name = "t_sys_role_perm_rela")
public class RolePermRela extends IdEntity {
	private Role role;
	private Permission permission;

	// 多对一关系定义
	@ManyToOne
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	// 多对一关系定义
	@ManyToOne
	@JoinColumn(name = "permission_id")
	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}
}
