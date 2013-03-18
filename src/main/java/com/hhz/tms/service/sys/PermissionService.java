/**
 * 
 */
package com.hhz.tms.service.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hhz.tms.dao.sys.PermissionDao;
import com.hhz.tms.entity.sys.Permission;
import com.hhz.tms.entity.sys.Resource;

/**
 * @author huangjian
 * 
 */
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class PermissionService {
	@Autowired
	private PermissionDao permissionDao;

	public List<Permission> findAll() {
		List<Permission> permissions = (List<Permission>) permissionDao.findAll();
		return permissions;
	}

	public Permission getEntity(Long id) {
		return permissionDao.findOne(id);
	}

	@Transactional(readOnly = false)
	public void save(Permission permission) {
		permissionDao.save(permission);
	}

	@Transactional(readOnly = false)
	public void delete(Long id) {
		permissionDao.delete(id);
	}
}
