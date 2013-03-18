/**
 * 
 */
package com.hhz.tms.service.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hhz.tms.dao.sys.RoleDao;
import com.hhz.tms.entity.sys.Role;

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
}
