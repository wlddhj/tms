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

import com.hhz.tms.dao.sys.RoleDao;
import com.hhz.tms.entity.sys.Role;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 *
 */
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class RoleService {
	@Autowired
	private RoleDao roleDao;

	public List<Role> findAll() {
		List<Role> roles = (List<Role>) roleDao.findAll();
		return roles;
	}

	public Role getEntity(Long id) {
		return roleDao.findOne(id);
	}

	@Transactional(readOnly = false)
	public void save(Role role) {
		roleDao.save(role);
	}

	@Transactional(readOnly = false)
	public void delete(Long id) {
		roleDao.delete(id);
	}
	

	@Transactional(readOnly = false)
	public void saveBatch(List<Role> insertedRecords, List<Role> updatedRecords,
			List<Role> deletedRecords) {
		for (Role role : insertedRecords) {
			save(role);
		}
		for (Role role : updatedRecords) {
			save(role);
		}
		for (Role role : deletedRecords) {
			delete(role.getId());
		}
	}

	public Page<Role> findPage(Map<String, Object> searchParams, PageRequest pageRequest) {
		Specification<Role> spec = WebUtil.buildSpecification(searchParams, Role.class);
		return roleDao.findAll(spec, pageRequest);
	}
}
