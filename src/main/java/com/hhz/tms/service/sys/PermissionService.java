/**
 * 
 */
package com.hhz.tms.service.sys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hhz.tms.dao.sys.PermissionDao;
import com.hhz.tms.entity.sys.Permission;
import com.hhz.tms.util.WebUtil;

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

	@Transactional(readOnly = false)
	public void saveBatch(List<Permission> insertedRecords, List<Permission> updatedRecords,
			List<Permission> deletedRecords) {
		for (Permission permission : insertedRecords) {
			save(permission);
		}
		for (Permission permission : updatedRecords) {
			save(permission);
		}
		for (Permission permission : deletedRecords) {
			delete(permission.getId());
		}
	}

	public Page<Permission> findPage(Map<String, Object> searchParams, PageRequest pageRequest) {
		Specification<Permission> spec = WebUtil.buildSpecification(searchParams, Permission.class);
		return permissionDao.findAll(spec, pageRequest);
	}

}
