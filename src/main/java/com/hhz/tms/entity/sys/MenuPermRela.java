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
@Table(name = "t_sys_menu_perm_rela")
public class MenuPermRela extends IdEntity {
	private Menu menu;
	private Permission permission;

	// 多对一关系定义
	@ManyToOne
	@JoinColumn(name = "menu_id")
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
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
