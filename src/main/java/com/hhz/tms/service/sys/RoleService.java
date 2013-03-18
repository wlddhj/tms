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

import com.hhz.tms.dao.BaseDao;
import com.hhz.tms.dao.sys.RoleDao;
import com.hhz.tms.entity.sys.Resource;
import com.hhz.tms.entity.sys.Role;
import com.hhz.tms.service.BaseService;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 *
 */
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class RoleService  extends BaseService<Role>{
	@Autowired
	private RoleDao roleDao;

	@Override
	public BaseDao<Role> getBaseDao() {
		// TODO Auto-generated method stub
		return roleDao;
	}

	@Override
	public Class<Role> getEntityClazz() {
		// TODO Auto-generated method stub
		return Role.class;
	}
}
