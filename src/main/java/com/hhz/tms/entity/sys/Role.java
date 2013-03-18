/**
 * 
 */
package com.hhz.tms.entity.sys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.hhz.tms.entity.IdEntity;

/**
 * @author huangjian
 * 
 */

@Entity
@Table(name = "t_sys_role")
public class Role extends IdEntity {
	private String roleCd;
	private String roleName;
	private String remark;
	private List<Permission> permissions;
	public String getRoleCd() {
		return roleCd;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "t_sys_role_perm_rela", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = { @JoinColumn(name = "permission_id") })
	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
}