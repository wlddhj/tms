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
// JPA标识
@Entity
@Table(name = "t_sys_resource_perm_rela")
public class ResourcePermRela extends IdEntity {
	private Resource resource;
	private Permission permission;

	// 多对一关系定义
	@ManyToOne
	@JoinColumn(name = "resource_id")
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
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
