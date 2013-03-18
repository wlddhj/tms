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
import com.hhz.tms.dao.sys.PermissionDao;
import com.hhz.tms.entity.sys.Permission;
import com.hhz.tms.service.BaseService;
import com.hhz.tms.util.WebUtil;

/**
 * @author huangjian
 * 
 */
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class PermissionService extends BaseService<Permission>{
	@Autowired
	private PermissionDao permissionDao;

	@Override
	public BaseDao<Permission> getBaseDao() {
		// TODO Auto-generated method stub
		return permissionDao;
	}

	@Override
	public Class<Permission> getEntityClazz() {
		// TODO Auto-generated method stub
		return Permission.class;
	}

}
